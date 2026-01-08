import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {

//        Task 1: Ən böyük və ən kiçik ədədi tap
//        Şərt:
//        Verilmiş int[] tipli array-dən
//        istifadə edərək:
//        Ən böyük ədədi tap.
//        Ən kiçik ədədi tap.
//        Hər ikisini ekrana çap et.
//                Nümunə:
//        int[] numbers = {4, 7, -2, 15, 0, 99, -100};
//        Gözlənilən çıxış:
//        Ən böyük ədəd: 99
//        Ən kiçik ədəd: -100
//
//        int[] numbers = {4, 7, -2, 15, 0, 99, -100};
//        int min = numbers[0];
//        int max = numbers[0];
//        for (int n : numbers) {
//            if (n > max) max = n;
//            if (n < min) min = n;
//        }
//        System.out.println("Ən böyük ədəd:" + max + "\n" + "Ən kiçik ədəd:" + min);

//        Task 2: 2 Ölçülü array-də əsas və köməkçi diaqonalın
//        cəmi
//        Şərt:
//        3x3 ölçülü kvadrat matrisi
//        verilir.
//                Əsas diaqonal: matrix[0][0],
//                matrix[1][1], matrix[2][2]
//        Köməkçi diaqonal: matrix[0][2],
//                matrix[1][1], matrix[2][0]
//        Hər iki diaqonalın cəmini hesabla
//        və çap et
//                (hesablayan zaman sadece : matrix[0][0]+ matrix[1][1]+matrix[2][2]etmeyin,dovrlerden
//        istifade edin).
//        Nümunə:
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        Gözlənilən çıxış:
//        Əsas diaqonal cəmi: 15
//        Köməkçi diaqonal cəmi: 15

//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        int mainDiagonal = 0;
//        int helperDiagonal = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            mainDiagonal += matrix[i][i];
//            helperDiagonal += matrix[i][matrix.length - 1 - i];
//        }
//        System.out.println("Əsas diaqonal cəmi:" + mainDiagonal + "\n" + "Köməkçi diaqonal cəmi:" + helperDiagonal);


//        Task 3: 3 Ölçülü Array-də müəyyən şərtə uyğun ədədləri
//        çap et
//        Şərt:
//        3D array verilir.
//        6-dan böyük olan bütün ədədləri
//        tap və çap et.
//        Nümunə:
//        int[][][] cube = {
//                {
//                        {1, 2}, {3, 4}
//                },
//                {
//                        {5, 6}, {7, 8}
//                }
//        };
//        Gözlənilən çıxış:
//        6-dan böyük ədədlər: 7, 8

//        int[][][] cube = {
//                {
//                        {1, 2}, {3, 4}
//                },
//                {
//                        {5, 6}, {7, 8}
//                }
//        };
//        System.out.println("6-dan böyük ədədlər:");
//        for (int i = 0; i < cube.length; i++) {           // layers
//            for (int j = 0; j < cube[i].length; j++) {    // rows
//                for (int k = 0; k < cube[i][j].length; k++) { // columns
//                    if (cube[i][j][k] > 6)
//                        System.out.println(cube[i][j][k] + ",");
//                }
//            }
//        }

//        Task 4:Verilən int[] array-i artan sıraya görə sort et.
//                Daha sonra array-in tərs versiyasını çap et.
//        Arrays.sort()
//        methodu istifade etmeyin.
//                Nümunə:
//        int[] arr = {10, 5, 8, 3, 1};
//        Gözlənilən çıxış:
//        Tərsinə sort edilmiş array: 10 8 5 3 1
//        int[] arr = {10, 5, 8, 3, 1};
//        int temp;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));


//        Task 5:Verilmiş string-i tərsinə çevir.
//        Yeni yaradılmış string-i çap et.
//        Nümunə:
//        Gözlənilən çıxış:
//        İvers edilmiş string: IanepO

//        String input = "OpenAI";
//        String reverse = "";
//        for (int i = input.length()-1; i >= 0; i--) {
//            reverse += input.charAt(i);
//        }
//        System.out.println(reverse);


//        Task 6:Verilmiş string-in palindrome olub-olmadığını
//        yoxla.
//                Palindrome: tərsinə oxunduqda da eyni olan söz.
//        Nümunə:
//        Gözlənilən çıxış:
//        madam palindrome-dur.
        String word = "madam";
        StringBuilder reverse = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse.append(word.charAt(i));
        }
        String result = reverse.toString().equals(word) ? "%s palindrome-dur" : "%s palindrome deyil";
        System.out.printf(result, word);

//        Task 7:Verilmiş cümlədə hər bir hərfin neçə dəfə
//        təkrarlandığını tap.
//        Boşluq və xüsusi simvolları nəzərə alma.
//        Nümunə:
//        String sentence = "Java is awesome";
//        Gözlənilən çıxış (sadəcə nümunə):
//        a - 3
//        e - 2
//        i - 1
//        j - 1
//
//.....
//        her bir herf nezere alinsin

//        String sentence = "Java is awesome";
//        sentence = sentence.toLowerCase();
//
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < sentence.length(); i++) {
//            char ch = sentence.charAt(i);
//
//            if (ch >= 'a' && ch <= 'z') {
//                map.put(ch, map.getOrDefault(ch, 0) + 1);
//            }
//        }
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }

    }
}

