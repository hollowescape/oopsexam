class name extends Exception{
	
	public String toString()
	{
		return " name of employee cannot be a number";
	}
}
class age extends Exception{

	public String toString()
	{
		return " age of employee can not be greatear than 50";
	}
}