import javax.swing.*;
import java.util.Objects;

class ArrayList {
    private int total;
    private String Name[],Number[];
    int current, size;

    public ArrayList(){
        current = -1;
        total = 50;
        Name = new String[total];
        Number = new String[total];
        size = 0;
    }

    public void AddName(String name) throws Exception {
        if (full()){
            throw new Exception("Phone Book is full");
        }else {
            size++;
            if (size==1)
            {
                current++;
                Name[current] = name;
            }
            else
            {
                for(int i=size-1;i>current+1;i--) {
                    Name[i] = Name[i - 1];
                }
                current++;
                Name[current] = name;
            }

        }
    }
    public void AddNum(String num) throws Exception {
        if (full()){
            throw new Exception("Phone Book is full");
        }else {
            size++;
            if (size==1)
            {
                current++;
                Number[current] = num;
            }
            else
            {
                for(int i=size-1;i>current+1;i--) {
                    Number[i] = Number[i - 1];
                }
                current++;
                Number[current] = num;
            }

        }
    }

    public void delete(int b) throws Exception
    {
        if (empty())
        {
            throw new Exception("No Contact In Phone Book");
        }else
        {
            current = b-1;
            if (size == 1)
                current = -1;
            else if (current==size-1)
                current = 0;
            else
            {
                for(int i=current;i<size-1;i++) {
                    Name[i] = Name[i + 1];
                    Number[i] = Number[i + 1];
                }
                current = 0;
            }
            size--;
        }
    }
    public boolean empty()
    {
        if(size==0)
            return true;
        else
            return false;
    }

    public boolean full()
    {
        if (size == total)
            return true;
        else
            return false;
    }

    public int getSize(){
        return size;
    }

    public String retrieveName() throws Exception
    {
        if (empty())
        {
            throw new Exception("No Contact In Phone Book");
        }
        else
        {
            return Name[current];
        }
    }
    public String retrieveNum() throws Exception
    {
        if (empty())
        {
            throw new Exception("No Contact In Phone Book");
        }
        else
        {
            return Number[current];
        }
    }
    public void findFirst() throws Exception
    {
        if (empty())
        {
            throw new Exception("No Contact In Phone Book");
        }else
        {
            current=0;
        }
    }
    public void findNext() throws Exception
    {
        if (empty())
        {
            throw new Exception("No Contact In Phone Book");
        }else
        {
            if (current != size-1)
                current = current+1;
        }
    }
    public int search(String x)
    {
        int n = getSize();
        for (int i = 0; i < n; i++) {
            if ((Objects.equals(Number[i], x))||(Objects.equals(Name[i], x)))
                return i;
        }
        return -1;
    }
    public String getName(int i){
        return Name[i];
    }
    public String getNum(int i){
        return Number[i];
    }
}