// ***************************************************************
//   Names.java
//
//   Prints a list of student names with their hometowns
//   and intended major
// ***************************************************************
public class studentTable
{
        // ------------------------
        // main prints the list
        // ------------------------
        public static void main (String[] args){
            makeTable();
        }
        public static void makeTable(){
            makeHeader();
            labelColumns();
            populateRows();
        }
        public static void makeHeader(){
            System.out.println("==========================================");
            System.out.println("==\t\tStudent Points\t\t==");
            System.out.println("==========================================");
        }
        public static void labelColumns(){
            System.out.println("Name\t\tLab\tBonous\tTotal");
            System.out.println("----\t\t---\t------\t----");
        }
        public static void  populateRows(){
        populateOneRow("Joe", 40, 7);
        populateOneRow("William", 50, 8);
        populateOneRow("MarySue",39, 10);
        }
        public static void populateOneRow(String name, int lab, int bonous){
            System.out.println(name + "\t\t" + lab + "\t" + bonous + "\t" + (lab + bonous));
        }
}

