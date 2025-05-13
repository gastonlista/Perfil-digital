public class DigitalProfile {
    public static void main(String[] args) {
        // Variables
        String name = "Gastón";
        String lastName = "Lista";
        String city = "San Jacinto";

        int age = 27;
        double height = 1.90;

        String[] hobbies = {"nadar", "videojuegos", "chocolate"};

        //Calculos
        int ageInWeeks = age * 52;
        int luckyNumber = (int) Math.round(Math.random() * 99 + 1);

        //Metodos de String
        String fullName = name + " " + lastName;
        String fullNameUpper = fullName.toUpperCase();
        String cityShort = city.substring(0, 3);
        int fullNameLength = fullName.length();

        //Output
        System.out.println("PERFIL DIGITAL DE: " + fullNameUpper);
        System.out.println("Ciudad: " + cityShort);
        System.out.println("Edad: " + age + " años (aprox. " + ageInWeeks + " semanas)");
        System.out.println("Altura: " + height + " m");
        System.out.println("Tus intereses: " + hobbies[0] + ", " + hobbies[1] + ", " + hobbies[2]);
        System.out.println("Tu número de la suerte es: " + luckyNumber);
        System.out.println("Tu nombre tiene " + fullNameLength + " caracteres");
    }
}
