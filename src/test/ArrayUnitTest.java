//package test;
//
//import main.ArrayCollection;
//import org.junit.jupiter.api.*;
//
//import java.util.List;
//
//public class ArrayUnitTest {
//    private static ArrayCollection<String> stringArrayCollection;
//
//    @BeforeAll
//    public static void init() {
//        stringArrayCollection = new ArrayCollection<String>();
//    }
//
//
//    @AfterEach
//    public void iterateAfterAndClean() {
//        stringArrayCollection.forEach(s -> System.out.println(s));
//        stringArrayCollection.clear();
//    }
//
//    @Test
//    public void testAdd() {
//        Assertions.assertEquals(0, stringArrayCollection.size());
//        Assertions.assertTrue(stringArrayCollection.isEmpty());
//        stringArrayCollection.add("test");
//        Assertions.assertEquals(1, stringArrayCollection.size());
//    }
//
//
//    @Test
//    public void iterate() {
//        Assertions.assertEquals(0, stringArrayCollection.size());
//        stringArrayCollection.addAll(List.of("test1", "test2", "test3", "test4"));
//        Assertions.assertEquals(4, stringArrayCollection.size());
//        for (String str : stringArrayCollection) {
//            Assertions.assertNotNull(str);
//        }
//    }
//
//
//    @Test
//    public void testContains() {
//        Assertions.assertEquals(0, stringArrayCollection.size());
//        stringArrayCollection.addAll(List.of("test1", "test2", "test3", "test4"));
//        Assertions.assertTrue(stringArrayCollection.contains("test1"));
//        Assertions.assertFalse(stringArrayCollection.contains("test0"));
//    }
//
//
//    @Test
//    public void testContainsAll() {
//        Assertions.assertEquals(0, stringArrayCollection.size());
//        stringArrayCollection.addAll(List.of("test1", "test2", "test3", "test4"));
//        Assertions.assertTrue(stringArrayCollection.containsAll(List.of("test1", "test2", "test3", "test4")));
//        Assertions.assertFalse(stringArrayCollection.containsAll(List.of("test1", "test0", "test3", "test4")));
//    }
//
//
//    @Test
//    public void removeItem() {
//        Assertions.assertEquals(0, stringArrayCollection.size());
//        stringArrayCollection.addAll(List.of("test1", "test2", "test3", "test4"));
//        Assertions.assertTrue(stringArrayCollection.remove("test3"));
//        Assertions.assertFalse(stringArrayCollection.contains("test3"));
//    }
//
//    @Test
//    public void removeList() {
//        stringArrayCollection.addAll(List.of("test1", "test2", "test3", "test4"));
//        stringArrayCollection.removeAll(List.of("test1", "test2", "test0"));
//        Assertions.assertEquals(2, stringArrayCollection.size());
//    }
//
//    @Test
//    public void retainList() {
//        stringArrayCollection.addAll(List.of("test1", "test2", "test3", "test4"));
//        stringArrayCollection.retainAll(List.of("test0", "test2", "test3"));
//        Assertions.assertEquals(2, stringArrayCollection.size());
//    }
//
//    @Test
//    public void toArray() {
//        stringArrayCollection.addAll(List.of("test1", "test2", "test3", "test4"));
//        Object[] arr = stringArrayCollection.toArray();
//        Assertions.assertEquals(4, arr.length);
//        Assertions.assertEquals("test1", arr[0]);
//    }
//
//
//}
