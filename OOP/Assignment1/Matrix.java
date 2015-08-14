
/**
 * @author Amit
 *
 */
public class Matrix {
	private int data[][];
	private int noRows;
	private int noCols;
	public Matrix(int row, int col)
	{
		this.noRows = row;
		this.noCols = col;
		data = new int[row][col];
	}
	
	public void addElements(int row, int col, int value)
	{
		data[row][col]=value;
	}
	
	public int getElement(int row, int col)
	{
		return this.data[row][col];
	}
	
	public int getNoRows()
	{
		return this.noRows;
	}
	
	public int getNoCols()
	{
		return this.noCols;
	}
	
	public Matrix transpose()
	{
		Matrix transposeMatrix = null;
		try
		{
			transposeMatrix = new Matrix(this.noCols, this.noRows);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return transposeMatrix;
		}
		for(int i = 0 ; i < noRows ; i++)
		{
			for(int j = 0; j < noCols ; j++)
			{
				transposeMatrix.data[j][i] = data[i][j];
			}
		}
		return transposeMatrix;
	}

	public void show()
	{
		for(int i = 0;i < noRows; i++)
		{
			for(int j = 0;j < noCols; j++)
			{
				System.out.println(this.data[i][j]);
			}
		}
	}
}
