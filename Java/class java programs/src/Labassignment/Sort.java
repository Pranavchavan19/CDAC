 package Labassignment;


public class Sort {

    public static void main(String[] args) {
        
        String names="Ramesh,Suresh,Dinesh,Bhavesh,Ganesh";
        String n []=names.split(",");
        
        for (String name : n) {
            System.out.println(names);
        }
        System.out.println("****************************************************");
        
        for (int i=0; i < n.length-1;i++){
            for (int j=i+1;j<n.length;j++){
                if (n[i].compareToIgnoreCase(n[j])>0){
                    String temp;
                    temp=n[i];
                    n[i]=n[j];
                    n[j]=temp;
                }
            }
        }
        System.out.println("sorted order");
        for (String name : n){
            System.out.println(name);
        }
    }
    
}