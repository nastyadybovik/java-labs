package by.bsu.abiturientArray;

import by.bsu.abiturient.Abiturient;
import by.bsu.exception.*;
import by.bsu.file.Reader;

import java.io.FileNotFoundException;

/**
 * Created by dom on 18.04.2015.
 */
public class AbiturientArray {

    private Abiturient[] array;

    public AbiturientArray() throws IdException, MarkException, NameException, PhoneException {
        array = new Abiturient[1];
        array[0] = defineAbiturient();
    }

    public AbiturientArray(int n) throws IdException, MarkException, NameException, PhoneException {
        array = new Abiturient[n];
        //for(int i=0; i<n; i++)
            //array[i] = new Abiturient();
    }

    public AbiturientArray(Abiturient[] arrayAb) throws  SetAbiturientException{
        array = new Abiturient[arrayAb.length];
        for(int i=0; i<arrayAb.length; i++)
            setAbiturient(i, arrayAb[i]);
    }

    public AbiturientArray(String fileName) throws FileNotFoundException, IdException, NameException, PhoneException, MarkException {
        array = new Abiturient[Reader.amount(fileName)];
        for(int i=0; i<Reader.amount(fileName); i++) //set!
            array[i] = new Abiturient();
        array = Reader.setAb(array, fileName);
    }

    private Abiturient defineAbiturient() throws IdException, MarkException, NameException, PhoneException {
        return new Abiturient();
    }

    public void setAbiturient(int i, Abiturient ab) throws SetAbiturientException{//название
        if(checkIndex(i))
            array[i] = ab;
        else
            throw new SetAbiturientException();
    }

    public Abiturient[] getArray() {
        return array;
    }

    public Abiturient getAbiturient(int i){
        return array[i];
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Абитуриенты:\n");
        for(int i=0; i<array.length; i++){
            s.append("#"+(i+1)+"  "+getAbiturient(i).toString()+"\n");
        }
        return s.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(this != obj) return false;
        if(this == null) return false;
        if(getClass() != obj.getClass()) return false;
        AbiturientArray o = (AbiturientArray)obj;
        if(array.length != o.getArray().length)
            return false;
        else {
            for(int i=0; i<array.length; i++){
                if ( !getAbiturient(i).equals(o.getAbiturient((i)))) return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode(){
        int result = 1;
        for(int i=0; i<array.length; i++){
            result += getAbiturient(i).hashCode();
        }
        return result;
    }

    private boolean checkIndex(int index){
        if( index >= 0)
            return true;
        else
            return false;
    }
}
