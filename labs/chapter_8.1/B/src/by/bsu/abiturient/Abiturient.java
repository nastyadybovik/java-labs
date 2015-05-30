package by.bsu.abiturient;

import by.bsu.exception.*;

/**
 * Created by dom on 17.04.2015.
 */
public class Abiturient {
    private int id;
    private String lastname;
    private String firstname;
    private String patronymic;
    private String phone;
    private int[] marks;
    private String address;

    public Abiturient() throws AbiturientException {
        setId(0);
        lastname = new String();
        setLastname("unknown");
        firstname = new String();
        setFirstname("unknown");
        patronymic = new String();
        setPatronymic("unknown");
        phone = new String();
        setPhone("unknown");
        marks = new int[1];
        setMark(0);
        address = new String();
        setAddress("unknown");
    }

    public Abiturient(int i, String ln, String fn, String patr, String ph, int[] m, String add) throws AbiturientException{
        try {
            setId(i);
            lastname = new String();
            setLastname(ln);
            firstname = new String();
            setFirstname(fn);
            patronymic = new String();
            setPatronymic(patr);
            phone = new String();
            setPhone(ph);
            marks = new int[m.length];
            setMarks(m);
            address = new String();
            setAddress(add);
        } catch(IdException e){

        }
    }

    public int getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getPhone() {
        return phone;
    }

    public int[] getMarks() {
        return marks;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int value) throws IdException {
        if(checkId(value))
            id = value;
        else throw new IdException("Нельзя создать абитуриента. Неподходящий id (<0).");
    }

    public void setMark(int value) throws MarkException {
        if(checkMark(value)){
            int[] cmarks = new int[marks.length];
            for(int i=0; i<cmarks.length; i++){
                cmarks[i] = marks[i];
            }
            marks = new int[cmarks.length+1];
            for(int i=0; i<cmarks.length; i++){
                marks[i] = cmarks[i];
            }
            marks[cmarks.length]=value;
        }
        else
            throw new MarkException("Нельзя создать абитуриента. Некорректная оценка (mark<0 или mark>100).");

    }

    public void setMarks(int[] value) throws MarkException {
        marks = new int[value.length];
        for(int i=0; i<value.length; i++){
            if(checkMark(value[i])){
                marks[i] = value[i];
            }
            else throw new MarkException("Нельзя создать абитуриента. Некорректная оценка (mark<0 или mark>100).");
        }
    }

    public void setFirstname(String name) throws NameException {
        if(checkName(name))
            firstname = name;
        else
            throw new NameException("Нельзя создать абитуриента. Введено пустое имя/фамилия/отчество/адресс.");
    }

    public void setLastname(String name) throws NameException {
        if(checkName(name))
            lastname = name;
        else
            throw new NameException("Нельзя создать абитуриента. Введено пустое имя/фамилия/отчество/адресс.");
    }

    public void setPatronymic(String name) throws NameException {
        if(checkName(name))
            patronymic = name;
        else
            throw new NameException("Нельзя создать абитуриента. Введено пустое имя/фамилия/отчество/адресс.");
    }

    public void setPhone(String p) throws PhoneException {
        if(checkPhone(p))
            phone = p;
        else
            throw new PhoneException("Нельзя создать абитуриента. Введён неверный телефонный номер (количество символов меньше 7).");
    }

    public void setAddress(String add) throws NameException {
        if( checkName(add) )
            address = add;
        else
            throw new NameException("Нельзя создать абитуриента. Введено пустое имя/фамилия/отчество/адресс.");
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Ид: "+id+"| Фамилия: "+lastname+"| Имя: "+firstname+"| Отчество: "+patronymic+"| Телефон: "+phone+"| Адресс: "+address+"| Оценки: ");
        for (int val : marks) {
            s.append(val+" ");
        }
        return s.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(this != obj) return false;
        if(this == null) return false;
        if(getClass() != obj.getClass()) return false;
        Abiturient ob = (Abiturient)obj;
        System.out.println(ob.getClass());
        if ( id != ob.getId()) return false;
        else {
            if ( !firstname.equals(ob.getFirstname()) ) return false;
            if ( !lastname.equals(ob.getLastname()) ) return false;
            if ( !patronymic.equals(ob.getPatronymic()) ) return false;
            if ( !phone.equals(ob.getPhone()) ) return false;
            if ( !address.equals(ob.getAddress()) ) return false;
            if ( !marks.equals(ob.getMarks()) ) return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        for(int i=0; i<prime; i++){
            result = prime * result + i;
        }
        return result;
    }

    //проверка входных данных
    private boolean checkId(int value){
        if(value >= 0) {
            return true;
        }
        else
            return false;
    }
    private boolean checkMark(int value){
        if(value>=0 && value<=100)
            return true;
        else
            return false;

    }
    private boolean checkName(String name){
        if(!name.isEmpty())
            return true;
        else
            return false;

    }
    private boolean checkPhone(String ph){
        if(ph.length() >= 7 ) //3147651
            return true;
        else
            return false;
    }
}