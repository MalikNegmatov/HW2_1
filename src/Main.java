public class Main {

    public static void main(String[] args) {
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println(person);
        changePerson(person);
        System.out.println(person);
    }
    public static void changePerson(Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";
        System.out.println("в методе - " + person);
    }
}