package lab_task_18;

public class employee  implements Comparable<employee>{

    private int id;
    private String name;
    private int Emp_id;

    public employee(int id, String name, int Emp_id) {
        this.id = id;
        this.name =  name;
        this.Emp_id = Emp_id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getEmp_id() {
        return Emp_id;
    }

    @Override
    public String toString() {
       return "id: "+id+"name: "+name +" age : "+Emp_id;
    }

    @Override
    public int compareTo(employee o) {
         return this.id-o.id;
    }
    

}
