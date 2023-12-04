public interface ListADT {
    public void AddName(String name) throws Exception;
    public void AddNum(String num) throws Exception;
    public void delete() throws Exception;
    public boolean empty();
    public boolean full();
    public int getSize();
    public String retrieveName() throws Exception;
    public String retrieveNum() throws Exception;
    public void findFirst() throws Exception;
    public void findNext() throws Exception;
    public int search(String x);
    public String getName(int i);
    public String getNum(int i);
}
