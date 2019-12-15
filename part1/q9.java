abstract class reservation{
	abstract boolean reserve(int seats,int typeofseat);
	abstract int getstatus();

}
class reservebus extends reservation{
	int totalseats;

	reservebus(int totalseats)
	{
		this.totalseats=totalseats;
	}
	boolean reserve(int seats,int typeofseat)
	{
		if((totalseats-seats)>0)
		{
			
			this.totalseats=this.totalseats-seats;
			return true;
		}
		else
		{
			
			return false;
		}
	}
	int getstatus()
	{
		return totalseats;
	}

}
class reservetrain extends reservation{
	int upts;
	int lbts;
	int mbts;
	reservetrain(int upts,int lbts,int mbts)
	{
		this.upts=upts;
		this.lbts=lbts;
		this.mbts=mbts;
	}
	boolean reserve(int seats,int typeofseat)
	{
		if(typeofseat==1)
		{
		if((upts-seats)>0)
		{
			
			this.upts=this.upts-seats;
			return true;
		}
		else
		{
			
			return false;
		}
		}
		if(typeofseat==2)
		{
		if((lbts-seats)>0)
		{
			
			this.lbts=this.lbts-seats;
			return true;
		}
		else
		{
			
			return false;
		}
		}
		if(typeofseat==3)
		{
		if((mbts-seats)>0)
		{
			
			this.mbts=this.mbts-seats;
			return true;
		}
		else
		{
			
			return false;
		}
		}
		else
		{
			System.out.println(" wrong typeof seat");
			return false;
		}

	} 
	int getstatus()
	{
		return (upts+lbts+mbts);
	}
}