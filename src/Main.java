public class Main {

    public static void main(String[] args) {
	// write your code here
        HoorayList<String> ourNames = new HoorayList<>();

        ourNames.add("Jorge");
        ourNames.add("Haylee");
        ourNames.add("Zynthia");
        ourNames.add("Paulding");
        ourNames.add("Tressah");
        ourNames.add("JC");
        ourNames.add("Corey");

        System.out.println(ourNames);

        //Remove Paulding
        ourNames.remove(3);
        // or ourNames.remove("Paulding"), removes first instance if multiple.

        System.out.println(ourNames);

    }
}
