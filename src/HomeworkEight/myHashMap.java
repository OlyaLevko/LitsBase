package HomeworkEight;

import java.util.*;

public class myHashMap<K,V> implements Map<K,V> {

       public myEntry <K,V> [] node;
       public int capacity;



    public myHashMap(int capacity) {
        this.capacity = capacity;
        node = new myEntry[capacity];

    }

    private class myEntry<K,V> {
           K key;
           V value;
           int h;


           public myEntry(K key, V value) {
               this.key = key;
               this.value = value;
               h =  key != null ?  key.hashCode()%(capacity-1):0;
           }
       }


    

    @Override
    public V putIfAbsent(K key, V value) {
        return !containsKey(key) ? put(key, value): null;
    }

    @Override
    public boolean remove(Object key, Object value) {
        remove(key);
        return true;
    }

    @Override
    public int size() {
        int size =0;

        for (int i = 0; i < capacity; i++) {
            if (node[i]!= null )
                size = size+1;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public boolean containsKey(Object key) {
        boolean b = false;
        for (int i = 0; i < capacity; i++) {
            if(node[i]!=null && key == node[i].key) {
                b = true;
                break;
            }

        }
        return b;
    }

    @Override
    public boolean containsValue(Object value)
    {boolean b = false;
        for (int i = 0; i < capacity; i++) {
            if(node[i]!=null && value == node[i].value) {
                b = true;
                break;
            }
        }
        return b;
    }

    @Override
    public V get(Object key) {
        int l = -1;
        if(key == null && node[0]!=null)
            return node[0].value;
        for (int i = 0; i < capacity; i++) {
            if(node[i]!=null && key == node[i].key) {
               l = i;
               break;
           }
        }

        return l != -1 ? node[l].value : null;
    }

    @Override
    public V put(K key, V value) {
        myEntry<K,V> newNode = new myEntry<>(key, value);
       if(node[newNode.h] == null || node[newNode.h].key ==key) {
           node[newNode.h] = newNode;

       }
            else for (int i = newNode.h +1; i < capacity; i++) {
                if (node[i] == null) {
                    node[i] = newNode;
                    break;
                }
                else if(i == capacity-1){
                    for (int j = 0; j < newNode.h; j++) {
                        if (node[j] == null) {
                            node[j] = newNode;
                            break;
                        }
                    }
                }
            }


        return newNode.value;

    }

    @Override
    public V remove(Object key) {
        for (int i = 0; i < capacity; i++) {
            if(node[i]!=null && key == node[i].key) {
                node[i] = null;
                break;
            }
        }
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        Iterator<? extends Entry<? extends K, ? extends V>> iterator = m.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<K,V> pair = (Entry<K, V>) iterator.next();
            put(pair.getKey(),pair.getValue());
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            node[i]=null;
        }

    }

    @Override
    public Set<K> keySet() {
        Set<K> keys = new HashSet<>();
        for (int i = 0; i < capacity; i++) {
            if(node[i]!=null)
                keys.add(node[i].key);
        }
        return keys;
    }

    @Override
    public Collection<V> values() {
        Collection<V> values = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            if(node[i]!=null)
                values.add(node[i].value);
        }
        return values;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set <Entry<K,V>> entry = new HashSet<>();
        for (int i = 0; i < capacity; i++) {
            if(node[i]!=null)
                entry.add((Entry<K, V>) node[i]);
        }
        return entry;
    }
}
