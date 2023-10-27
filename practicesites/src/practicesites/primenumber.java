package practicesites;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5,i=1;
boolean prime=false;
for(i=1;i<=n/2;i++) {
	if(n%i==0) {
		prime=true;
	}
}
if(prime==true) {
	System.out.println("prime number");
}
else {
	System.out.println("not prime number");

}
	}

}
