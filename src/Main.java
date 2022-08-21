public class Main {
    public static void main(String[] args) {
        // Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        lastName = lastName +" "+ firstName +" "+ middleName;
        System.out.println("ФИО сотрудника - " + lastName);
        // Задание 2
        String fullName = "Ivanov Ivan Ivanovich";
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName1);
        // Задание 3
        String fullName3="Иванов Семён Семёнович";
        String[] words = fullName3.split(" ");
        for(int i=0; i< words.length;i++){
            if (words[i].contains("ё")){
                words[i]=words[i].replace("ё","е");
            }
        }
        fullName3 = words[0];
        for (int i = 1; i < words.length; i++) {
            fullName3+=" " + words[i];
        }
        System.out.println("Данные ФИО сотрудника - " + fullName3);
    }
}
// вопрос существует ли метод объединяющй слова из массива обратно в строку