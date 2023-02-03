public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Pangon La-or-on");
        System.out.println(person.getName());
        person.setHeight(173);
        System.out.println(person.getHeight());
        person.setHeightInInches(person.getHeight());
        System.out.println(person.getHeightInInches());
        
    }
}
