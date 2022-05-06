package testcase;

import org.testng.annotations.Test;

import base.Commanclass;

public class Getrequest extends Commanclass {

	@Test
	public void getr()
	{
		getm("https://dummy.restapiexample.com/api/v1/employees");
	}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Getrequest g=new Getrequest();
		g.getr();
	}*/
	@Test
	public void postm1()
	{
		postm("https://dummy.restapiexample.com/api/v1/create","{\n"+"\"name\":\"charmi\",\n"+"\"salary\":\"1223\",\n"+"\"age\":\"23\"\n"+"}");
		
	}

	@Test
	public void update()
	{
		putm("https://dummy.restapiexample.com/api/v1/update/21","{\n"+"\"name\":\"deep\",\n"+"\"salary\":\"243\",\n"+"\"age\":\"24\"\n"+"}");
	}
	@Test
	public void deletema()
	{
		deletem("https://dummy.restapiexample.com/api/v1/delete/3");
	}
}
