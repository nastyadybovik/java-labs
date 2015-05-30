package by.bsu.lesson_2;

/**
 * Created by dom on 21.02.2015.
 * @see by.bsu.lesson_2
 */
public class DifferentNum {
    private int[] mass;

    /**
     * Constructor
     * @param array
     */
    public DifferentNum(int[] array) {
        int n = array.length;
        mass = new int[n];
        for (int i=0; i<n ; i++)
            mass[i] = array[i];
    }

    /**
     * @return The number that has the smallest amount of different numerics.
     */
    public int different(){
        //выделяем мето и формируем главный массив, который состоит из 0-9
        int[] main_mass = new int[10];
        for(int i=0; i<10; i++)
            main_mass[i]=i;

        int min=1000, index_min=0;
        for(int h=0; h<mass.length; h++){

            int d , n=0 , el_copy=mass[h] , el_copy2=mass[h];
            //прогоняем каждый элемент, чтобы  узнать из скольки чисел он состоит, чтобы правильно сформировать массив num
            if(el_copy !=0 ) {
                while ( el_copy != 0 ){
                    n++;
                    el_copy/=10;
                }
            }
            else n=1;

            //выделяем место и формируем массив для каждого сила, который будет состоять из его цифр
            int i=0;
            int[] num = new int[n];
            if(el_copy2 !=0 ) {
                while ( el_copy2 != 0 ){
                    d = el_copy2%10;
                    num[i] = d;
                    i++;
                    el_copy2/=10;
                }
            }
            else num[0]=0;

            //System.out.println("\nNUM "+mass[h]+"( "+ n +" ) :");
            //for(Integer k : num) System.out.println(k);

            int schet=0;
            //заполняем массив num_mass
            int[] num_mass = new int[10];
            for(int j=0 ; j<10 ; j++){
                schet=0;
                for(int l=0; l<n ; l++){
                    if(main_mass[j] == num[l])
                        schet++;
                }
                num_mass[j]=schet;
            }

            //System.out.println("\nNUM_MASS "+mass[h]+"( "+ n +" ) :");
            //for(int y=0; y<num_mass.length; y++ ) System.out.print(num_mass[y]+ " , ");

            //считаем число различных элементов
            int schet2=0;
            for(Integer p : num_mass ){
                if(p!=0)
                    schet2++;
            }
            if(schet2 < min){
                min=schet2;
                index_min=h;
            }
        }
        return mass[index_min];
    }

}
