package Iterator;

/**
 * Created by Mustafa on 12/11/2017.
 */
public class NamesRepos implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new StringIterator();
    }

    private class StringIterator implements Iterator{
        int index = 0;
        @Override
        public boolean hasNext() {
            if(index > names.length){
                return false;
            }
            return  true;
        }

        @Override
        public Object next() {
            String name = names[index];
            index ++;
            return name;
        }
    }
}
