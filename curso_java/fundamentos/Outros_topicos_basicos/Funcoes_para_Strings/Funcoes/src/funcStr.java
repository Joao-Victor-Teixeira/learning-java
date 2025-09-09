public class funcStr {
    public static void main(String[] args) throws Exception {
        
        String original = "abcde FGHIJ ABC  abc DEFG";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.printf("Original - %s -%n",original);
        System.out.printf("toLoweCase(minusculo) - %s -%n",s01);
        System.out.printf("toUpperCase (maiusculo) - %s -%n",s02);
        System.out.printf("trim (remover os espaços nos cantos) - %s -%n",s03);
        System.out.printf("substring(2 começa o indice 2) - %s -%n",s04);
        System.out.printf("substring (2,9 começa no indice 2 e vai ate o indice 9) - %s -%n",s05);
        System.out.printf("replace('a','x' sempre que encontrar um a vai trocar por x) - %s -%n",s06);
        System.out.printf("replace('abc','xy' dessa vez mudando uma substring) - %s -%n",s07);
        System.out.printf("indexOf(para saber a primiera vez que 'bc' apareceu) - %s -%n",i);
        System.out.printf("lastIndexOf(para saber a ultima vez que 'bc' apareceu) -%s -%n",j);
    }
}
