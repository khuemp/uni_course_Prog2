#!/usr/bin/env python3
import os
from pathlib import Path

root_dir = str(Path.home()) + "/Studium"
paths = [root_dir + "/Verschiedenes", root_dir + "/Unterlagen", root_dir + "/.Versteckt"]
lorem = """
        Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.
        """
solution = "Prog2 macht Spaß"
lecture = [("Prog1", 3), ("PDI", 1), ("MfI1", 2)]
materials = ["slides", "exercises", "solutions"]
weeks = 15
all_tasks = [1, 2, 3]

file_structure = [    
            "Unterlagen", 
            [
                "SoSe 2021", 
                [
                    "Prog2-Vorkurs"
                ]
            ],
            [
                "WiSe 2020", 
                [
                    "MfI1", 
                    [
                        "exercises"
                    ],
                    [
                        "slides"
                    ]
                ],
                
                [
                    "PDI", 
                    [
                        "slides"
                    ]
                ],
                [
                    "Prog1", 
                    [
                        "exercises"
                    ],
                    [
                        "slides"
                    ],
                    [
                        "solutions"
                    ]
                ]
            ]
        ]


def add_bool_arg(parser, name, helpText, default=False):
        group = parser.add_mutually_exclusive_group(required=False)
        group.add_argument('--' + name, dest=name, action='store_true', help=helpText)
        group.add_argument('--no-' + name, dest=name, action='store_false',
                           help='the negation of ' + name)
        parser.set_defaults(**{name: default})


def create_dir(path):
    if not os.path.exists(path):
        os.mkdir(path)


def create_files_task1():
    names = [s.strip('.,;\n') for s in lorem.split(" ") if s not in ["", "\n"]]
    for name in names:
        with open(paths[0] + "/" + name + ".log", 'a') as new_file:
            new_file.write(lorem)
        with open(paths[0] + "/" + name + "-fehler.txt", 'a') as new_file:
            new_file.write(lorem)
        with open(paths[0] + "/" + name + "-fehler." + name, 'a') as new_file:
            new_file.write(lorem)
    for n, c in zip(range(0, len(solution)), solution):
        with open(paths[0] + "/" + f"{n:03d}" + ".txt", "a") as new_file:
            new_file.write(str(c))


def create_files_task2():
    for l in lecture:
        for m in materials[:l[1]]:
            for w in range(1, weeks + 1):
                filepath = paths[1] + "/" + l[0] + "-" + m + "-" + str(w) + ".pdf"
                with open(filepath, "a") as material:
                    print(filepath)
                    material.write(lorem)

def create_files_task3():
    pass

def clear(tasks):
    import shutil
    if not os.path.exists(root_dir):
        print("\x1b[1;31;40m" + "Der Ordner Studium wurde nicht korrekt anglegt." + "\x1b[0m")
        exit(1)
    for t in tasks:
        idx = t - 1
        if os.path.exists(paths[idx]):
            shutil.rmtree(paths[idx])
        create_dir(paths[idx])


def print_test_result(name, res):
    if res:
        print("\x1b[1;32;40m" + "Success: " + "\x1b[0m", end="")
    else:
        print("\x1b[1;31;40m" + "Fail: " + "\x1b[0m", end="")
    print(name)


# amount of files that contain a substr
def amount_of_files(dir, substr):
    return len([name for name in os.listdir(dir) if os.path.isfile(dir + '/' + name) and substr in name])


# there's exactly the match in dir
def exact_match(dir, match):
    files_in_dir = [name for name in os.listdir(dir) if os.path.isfile(dir + '/' + name)]
    return len(files_in_dir) == 1 and files_in_dir[0] == match


def read_file(f):
    if not os.path.exists(f):
        return ''
    with open(f, 'r') as file:
        return file.read().replace('\n', '')


def check_structure(directory, structure):
    folder_count = 0
    expected_count = 0
    for s in structure:
        if isinstance(s, str):
            if folder_count != expected_count:
                return False
            new_folder = directory + '/' + s
            if not os.path.exists(new_folder):
                return False
            folder_count = 0
            expected_count = len([n for n in os.listdir(directory + '/' + s) if os.path.isdir(directory + '/' + s + '/' + n)])
        else:
            folder_count += 1
            if not check_structure(new_folder, s):
                return False
    return folder_count == expected_count


def check_directory(files):
    for i in range(0, files[1]):
        path = root_dir + "/Unterlagen/WiSe 2020/" + files[0] + "/" + materials[i] + "/"
        if not os.path.exists(path):
            print("path does not exist " + path)
            return False
        if len(os.listdir(path)) != 15:
            print("path does not contain 15 files" + path)
            return False
        for j in range(1, weeks + 1):
            filename = path + files[0] + "-" + materials[i] + "-" + str(j) + ".pdf"
            filename_bonus = path + str(j) + ".pdf"
            if not (os.path.isfile(filename) or os.path.isfile(filename_bonus)):
                print("filename not found " + filename + "\n\tor " + filename_bonus)
                return False
    return True


def test1():
    p = paths[0]
    print_test_result("Alle .log Dateien gelöscht.", not amount_of_files(p, ".log"))
    print_test_result("Alle fehler Dateien gelöscht.", not amount_of_files(p, "fehler"))
    print_test_result("Es existiert nur noch ergebnis.txt.", exact_match(p, "ergebnis.txt"))
    print_test_result("Es steht der richtige Text in ergebnis.txt.", read_file(p + "/ergebnis.txt") == solution)


def test2():
    print_test_result("Ordnerstruktur richtig erstellt.", check_structure(root_dir, file_structure))
    print_test_result("Prog1 richtig befüllt.", check_directory(lecture[0]))
    print_test_result("PDI richtig befüllt.", check_directory(lecture[1]))
    print_test_result("MfI1 richtig befüllt.", check_directory(lecture[2]))


def test3():
    path = root_dir + "/"
    hidden = not os.path.exists(path + ".Versteckt")
    found = os.path.exists(path + "Gefunden")
    print_test_result("Das versteckte Verzeichnis wurde gefunden.", hidden and found)


def run_tests():
    for i in all_tasks:
        print("running test " + str(i) + ":")
        eval("test" + str(i) + "()")


def setup(args):
    import os
    if args.check:
        run_tests()
    else:
        if not os.path.exists(root_dir):
            print("\x1b[1;31;40m" + "Der Ordner Studium wurde nicht korrekt anglegt." + "\x1b[0m")
            exit(1)
        # remove unnecessary data in root dir, but not root dir itself
        os.system("rm -r " + root_dir + "/{*,.*} 2> /dev/null")
        # setup tasks
        tasks = []
        for i in all_tasks:
            if eval("args.task" + str(i)):
                tasks.append(i)
        if len(tasks) == 0:
            tasks = all_tasks
        clear(tasks)
        for i in tasks:
            eval("create_files_task" + str(i) + "()")


def main(args):
    import argparse
    argparser = argparse.ArgumentParser(description='Initialization of Unix Task')
    add_bool_arg(argparser, 'task1', 'Initialisierung von Verschiedenes')
    add_bool_arg(argparser, 'task2', 'Initialisierung von Unterlagen')
    add_bool_arg(argparser, 'task3', 'Initialisierung von (noch nicht) Gefunden')
    add_bool_arg(argparser, 'check', 'Überprüft den bisherigen Fortschritt der Aufgabenstellungen.')
    args = argparser.parse_args()
    setup(args)


if __name__ == "__main__":
    import sys
    main(sys.argv)
