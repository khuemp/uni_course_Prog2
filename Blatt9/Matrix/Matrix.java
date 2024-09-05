public class Matrix {
    int width;
    int height;
    int [][] matrix;

    public Matrix(int width, int height){
        this.width = width;
        this.height = height;
        this.matrix = new int [height][width];
    }    

    public void setValue(int h, int w, int value){
        matrix[h][w] = value;
    }

    public int getValue(int h, int w){
        return matrix[h][w];
    }

    public int getMinValue(){
        int minValue = matrix[0][0];
        for(int i = 0; i<height; i++){
            for(int j = 0; j<width; j++){
                if(matrix[i][j]<minValue){
                    minValue = matrix[i][j];
                }
            }
        }
        return minValue;
    }

    public double getAverage(){
        double sum = (double)matrix[0][0];
        for(int i = 0; i<height; i++){
            for(int j = 0; j<width; j++){
                if(matrix[i][j]<minValue){
                    sum += matrix[i][j];
                }
            }
        }
        return sum/(height*width);
    }
    }
}
