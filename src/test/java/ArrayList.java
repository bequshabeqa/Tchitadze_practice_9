public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> colors = new java.util.ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        try {
            System.out.println(colors);
            System.out.println("Second color: " + colors.get(1));
        }catch (IndexOutOfBoundsException e) {
            System.out.println("მსგავსი ინდექსის ელემენტი არ მოიძებნა! ");
        }

        colors.remove(0);

        System.out.println("After removal: " + colors);

    }
}
