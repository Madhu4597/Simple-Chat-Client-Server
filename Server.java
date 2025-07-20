import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.InputStreamReader;

class Server
{
	public static void main(String[] args) 
	{
		try
		{
			int i=1;
			ServerSocket ss = new ServerSocket(16000);
			Socket cs = ss.accept();
			//reading from the client 
			BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			//writing to the client
			PrintWriter pw = new PrintWriter(cs.getOutputStream(),true);// true is used for the aoto flushing so that we need not to wait for the buffer to full
			while (true)
			{
			
			String rq=br.readLine();
			System.out.println("A meassage for the client : "+rq);
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the message to client :");
			String info = input.nextLine();
			pw.println(info);
			System.out.println("Enter 1 to continue and 0 to stop ");
			i=input.nextInt();
			if (cs == null)
			{
				System.out.println("Client is not responding ");
				ss.close();
			}
			if (i==0)
			{
				ss.close();
			}

			}
			
			





			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
