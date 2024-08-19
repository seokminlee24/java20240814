package ch02.lectule.p03string;

public class C08TempIate {
    public static void main(String[] args) {
        String name = "흥민";
        int age = 33;

        //이름은 흥민, 나이는 33살
        String a = "이름은" + name + ", 나이는 " + age;
        System.out.println(a);
        System.out.printf("이름은 %s, 나이는 %d%n", name, age);

        //string template
        String b = STR."이름은 \{name}, 나이는 \{age}";
        System.out.println(b);

        //
        String title = "내 웹페이지";
        String heading = "웹 페이지 제목";
        String para = "웹 페이지의 내용";

        String html1 = """
                <html>
                  <head>
                   <title>"""
                +title + """
                    </title>
                </head>
                <body>
                  <h1>"""
                + heading + """
                </h1>
                <p>"""
                + para + """
                    </p>
                  </body>
                </html>
                """;

        String html2 = STR."""
                <html>
                  <head>
                    <title>\{title}</title>
                  </head>
                  <body>
                    <h1>\{heading}</h1>
                    <p>\{para}</p>
                  </body>
                </html>
                """;
        System.out.println(html1);
        System.out.println();
        System.out.println(html2);
    }
}
