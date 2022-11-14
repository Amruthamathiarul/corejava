package loop;
abstract class Bird {
abstract void makeSound();
}
class Cuckoo extends Bird {
public void makeSound() {
System.out.println("The sound that a Cuckoo makes : ku ku");
 
 }
}
class CanadaGoose extends Bird {
public void makeSound() {
System.out.println("The sound that an CanadaGoose makes: honk honk");
 
 }
}
public class AbstractClass{
public static void main(String[] args) {
Cuckoo d = new Cuckoo();
d.makeSound();
 
CanadaGoose c = new CanadaGoose();
c.makeSound();
 
}
}


