//package ch17.lecture.exercise;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class P774_8 {
//    public static void main(String[] args) {
//
//
//        List<Member> list = Arrays.asList(
//                new Member("홍길동", "개발자"),
//                new Member("김나리", "디자이너"),
//                new Member("신용권", "개발자")
//        );
//
//        Map<String, List<Member>> member = members.stream()
//                .collect(Collectors.groupingBy(Member::getJob));
//
//        System.out.println("[개발자]");
//        collect.get("개발자")
//                .stream()
//                .forEach(System.out::println);
//
//        System.out.println("[디자이너]");
//        collect.get("디자이너")
//                .stream()
//                .forEach(System.out::println);
//
//
//
//    }
//}
//
//class Member8 {
//    String name;
//    String job;
//
//    public String getName() {
//        return name;
//    }
//
//    public String getJob() {
//        return job;
//    }
//
//    public Member8(String name, String job) {
//        this.name = name;
//        this.job = job;
//    }
//
//    @Override
//    public String toString() {
//        return "Member8{" +
//                "name='" + name + '\'' +
//                ", job='" + job + '\'' +
//                '}';
//    }
//}
