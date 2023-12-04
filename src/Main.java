import javax.swing.*;

public class Main {
    public static void main(String[] args){
        String choice,result;
        int ch = 0;
        ArrayList Name = new ArrayList();
        ArrayList Number = new ArrayList();
        while(ch != 6)
        {
            try{
                choice = JOptionPane.showInputDialog(null,
                        " ---------------------------------- \n"+
                                "                  Menu \n"+
                                " ---------------------------------- \n"+
                                "        1. Add New Contact\n"+
                                "        2. Delete Contact\n"+
                                "        3. Search By Name\n"+
                                "        4. Search By Number\n"+
                                "        5. Print All Contact\n"+
                                "        6. Exit\n"+
                                " ----------------------------------\n");
                ch = Integer.parseInt(choice);
                switch (ch)
                {
                    case 1:
                        String n = JOptionPane.showInputDialog(null,"Enter Name:");
                        String num = JOptionPane.showInputDialog(null,"Enter Number:");
                        Name.AddName(n);
                        Number.AddNum(num);
                        break;
                    case 2:
                        Name.findFirst();
                        Number.findFirst();
                        String b = "";
                        for(int i = 1;i<Name.getSize()+1;i++)
                        {
                            b += ("Id : "+i+" | "+"Name : "+Name.retrieveName()+" | "+"Number : "+Number.retrieveNum()+"\n");
                            Name.findNext();
                            Number.findNext();
                        }
                        int sel = Integer.parseInt(JOptionPane.showInputDialog(null,b+"\n Select ID To Delete :"));
                        Name.delete(sel);
                        Number.delete(sel);
                        break;
                    case 3:
                        String nam = JOptionPane.showInputDialog(null,"Enter Name:");
                        int index = Name.search(nam);
                        if (index == -1){
                            result = "Not Found";
                        }else {
                            result = ("Name : "+Name.getName(index)+" | "+"Number : "+Number.getNum(index));
                        }
                        JOptionPane.showMessageDialog(null,result);
                        break;
                    case 4:
                        String numb = JOptionPane.showInputDialog(null,"Enter Number:");
                        int indexN = Number.search(numb);
                        if (indexN == -1){
                            result = "Not Found";
                        }else {
                            result = ("Name : "+Name.getName(indexN)+" | "+"Number : "+Number.getNum(indexN));
                        }
                        JOptionPane.showMessageDialog(null,result);
                        break;
                    case 5:
                        Name.findFirst();
                        Number.findFirst();
                        String a = "";
                        for(int i = 1;i<Name.getSize()+1;i++)
                        {
                            a += ("Id : "+i+" | "+"Name : "+Name.retrieveName()+" | "+"Number : "+Number.retrieveNum()+"\n");
                            Name.findNext();
                            Number.findNext();
                        }
                        JOptionPane.showMessageDialog(null,a);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null,
                                "----------End Program ----------",
                                "Quit",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default :
                        JOptionPane.showMessageDialog(null,
                                "Not a correct choice, try again",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                        break;

                }
            }catch (Exception err){
                JOptionPane.showMessageDialog(null,err.getMessage());
            }

        }
}
}
