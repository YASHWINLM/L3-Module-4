
public class Reverse {
public static void main(String[] args) {
	Reverse r = new Reverse();
	System.out.println(r.reverse("Hello"));
}

private String reverse(String s) {
	// TODO Auto-generated method stub
if (s.length()==1) {
	return s;
}
else {
	return s.substring(s.length()-1, s.length())+reverse(s.substring(0, s.length()-1));
	
}
}
}
