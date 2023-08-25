package seminar4;

import java.util.Iterator;
import java.util.Map;

public class HashMap<K, V> implements Iterable<HashMap.Entity> {
    private static final int INIT_BUCKET_COUNT = 16;
    private static final double LOAD_FACTOR = 0.5;
    private Bucket[] buckets;
    private int size;

    @Override
    public Iterator<HashMap.Entity> iterator() {
        return new HashMapIterator();
    }

    class HashMapIterator implements Iterator<HashMap.Entity> {
        /**
         * TODO: Необходимо доработать структуру класса HashMap, реализованную на семинаре.
         * У нас появились методы добавления, удаления и поиска элемента по ключу.
         * Добавить возможность перебора всех элементов нашей структуры данных,
         * необходимо добавить несколько элементов,
         * а затем перебрать все элементы таблицы используя цикл foreach.
         * Подумайте, возможно вам стоит обратиться к интерфейсу Iterable.
         */

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Entity next() {
            return null;
        }
    }

    /**
     * TODO: Вывести все элементы хеш-таблицы на экран через toString()
     *
     * @return
     */

    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * Элемент хеш-таблицы
     */
    class Entity {
        /**
         * Ключ
         */
        K key;

        /**
         * Значение элемента
         */
        V value;
    }

    /**
     * Бакет, связный список
     */
    class Bucket {
        /**
         * Указатель на первый элемент связного списка
         */
        Node head;

        /**
         * Узел бакета (связного списка)
         */
        class Node {
            /**
             * Указатель на следующий элемент связного списка
             */
            Node next;
            /**
             * Значение узла, указывающее на элемент хеш-таблицы
             */
            Entity value;
        }

        public V add(Entity entity) {
            Node node = new Node();
            node.value = entity;

            if (head == null) {
                head = node;
                return null;
            }

            Node currentNode = head;
            while (true) {
                if (currentNode.value.key.equals(entity.key)) {
                    V buf = currentNode.value.value;
                    currentNode.value.value = entity.value;
                    return buf;
                }
                if (currentNode.next != null) {
                    currentNode = currentNode.next;
                } else {
                    currentNode.next = node;
                    return null;
                }
            }
        }

        public V remove(K key) {
            if (head == null) {
                return null;
            }
            if (head.value.key.equals(key)) {
                V buf = head.value.value;
                head = head.next;
                return buf;
            } else {
                Node node = head;
                while (node.next != null) {
                    if (node.next.value.key.equals(key)) {
                        V buf = node.next.value.value;
                        node.next = node.next.next;
                        return buf;
                    }
                    node = node.next;
                }
                return null;
            }
        }

        public V get(K key) {
            Node node = head;
            while (node != null) {
                if (node.value.key.equals(key)) {
                    return node.value.value;
                }
                node = node.next;
            }
            return null;
        }
    }

    private int calculateBucketIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    private void recalculate() {
        size = 0;
        Bucket[] old = buckets;
        buckets = new HashMap.Bucket[old.length * 2];
        for (int i = 0; i < old.length; i++) {
            Bucket bucket = old[i];
            if (bucket != null) {
                Bucket.Node node = bucket.head;
                while (node != null) {
                    put(node.value.key, node.value.value);
                    node = node.next;
                }
            }
        }
    }
    
}
