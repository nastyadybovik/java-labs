package by.bsu.chapter_5.gradeBook;

/**
 * Created by dom on 24.04.2015.
 */
public class GradeBook {
    private int id;
    private int course;
    private String name;
    private Session[] sessions;

    public class Session{
        private String start;
        private String end;
        private Exam[] exams;
        private Zachet[] zachets;

        public Session(){
            start =  new String("0");
            end = new String("0");
        }

        public Session(String s, String d){
            start =  new String(s);
            end = new String(d);
        }

        public String getStart() {
            return start;
        }

        public void setStart(String start) {
            this.start = start;
        }

        public String getEnd() {
            return end;
        }

        public void setEnd(String end) {
            this.end = end;
        }

        @Override
        public String toString() {
            return "Начало: "+start+" Конец: "+end+"\n";
        }

        public class Exam{
            private String teacherName;
            private int mark;
            private String date;

            public Exam(){
                teacherName = new String("unknown");
                mark =0;
                date = "unknown";
            }

            public Exam(String da, int m , String tName) {
                date = da;
                mark = m;
                teacherName = new String(tName);
            }

            public String getTeacherName() {
                return teacherName;
            }

            public void setTeacherName(String teacherName) {
                this.teacherName = teacherName;
            }

            public int getMark() {
                return mark;
            }

            public void setMark(int mark) {
                this.mark = mark;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            @Override
            public String toString() {
                return "Дата: "+date+" Имя преподавателя: "+teacherName+" Оценка: "+mark;
            }
        }

        public Exam[] getExams() {
            return exams;
        }

        public void setExams(int n, String[] teachernam, int[] m, String[] dat) {
            exams = new Exam[n];
            for(int i=0; i< exams.length; i++){
                exams[i] = new Exam(dat[i], m[i], teachernam[i]);
            }
        }

        public void addExam(Exam exam){
            Exam[] tmp = new Exam[exams.length+1];
            for(int i=0; i<exams.length; i++){
                tmp[i] = exams[i];
            }
            tmp[exams.length] = exam;
            exams = new Exam[tmp.length];
            for(int i=0; i<tmp.length; i++){
                exams[i] = tmp[i];
            }
        }

        public class Zachet{
            private String teacherName;
            private boolean zachet;
            private String date;

            public Zachet(){
                teacherName = new String("unknown");
                zachet = false;
                date = "unknown";
            }

            public Zachet(String da, boolean m , String teacher) {
                date = da;
                zachet = m;
                teacherName = new String(teacher);
            }

            public String getTeacherName() {
                return teacherName;
            }

            public void setTeacherName(String teacherName) {
                this.teacherName = teacherName;
            }

            public void setZachet(boolean z){
                zachet = z;
            }

            public boolean getZachet() {
                return zachet;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            @Override
            public String toString() {
                StringBuilder s = new StringBuilder();
                s.append("Дата: "+date+" Имя преподавателя: "+teacherName);
                if(zachet) s.append(" Зачёт: да");
                else s.append(" Зачёт: нет");
                return s.toString();
            }
        }

        public Zachet[] getZachets() {
            return zachets;
        }

        public void setZachets(int n, String[] teachernam, boolean[] z, String[] dat) {
            zachets = new Zachet[n];
            for(int i=0; i< zachets.length; i++){
                zachets[i] = new Zachet(dat[i], z[i], teachernam[i]);
            }
        }
    }

    public GradeBook(){
        id = 0;
        course = 0;
        name = new String("unknown");
    }

    public GradeBook(int id, int course, String n) {
        this.id = id;
        this.course = course;
        name = new String(n);
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Session[] getSessions() {
        return sessions;
    }

    public void setSessions(int n, String[] st, String[] en) {
        sessions = new Session[n];
        for(int i=0; i< sessions.length; i++){
            sessions[i] = new Session(st[i], en[i]);
        }
    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Ид: "+id+" Курс: "+course+" Имя: "+name+"\n");
        s.append("Сессии");
        for(int i=0; i<sessions.length; i++){
            s.append("\n#"+(i+1)+sessions[i]);
            s.append("Экзамены");
            for(int j=0; j<sessions[i].exams.length; j++){
                s.append("\n"+sessions[i].exams[j].toString());
            }
            s.append("\nЗачёты");
            for(int f=0; f<sessions[i].zachets.length; f++){
                s.append("\n"+sessions[i].zachets[f].toString());
            }
        }
        return s.toString();
    }
}
