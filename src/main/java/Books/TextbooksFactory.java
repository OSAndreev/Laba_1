package Books;


import java.util.*;

import com.github.javafaker.Faker;



public class TextbooksFactory{
    private static final List<String> educationLevels = Arrays.asList(
            "Bachelor's degree",
            "Master's degree",
            "Doctorate (Ph.D.)"
    );

    private static final List<String> courseraCourses = Arrays.asList(
            "Machine Learning",
            "Python for Everybody",
            "Data Science Specialization",
            "Introduction to Computer Science",
            "Neural Networks and Deep Learning",
            "Blockchain Basics",
            "Financial Markets",
            "Introduction to Philosophy",
            "Java Programming and Software Engineering Fundamentals",
            "HTML, CSS, and JavaScript for Web Developers",
            "Algorithms",
            "The Science of Well-Being",
            "Business Foundations",
            "Programming for Everybody (Getting Started with Python)",
            "R Programming",
            "Introduction to Mathematical Thinking",
            "Social Psychology",
            "The Data Scientist’s Toolbox",
            "Big Data",
            "Excel Skills for Business",
            "Web Design for Everybody (Basics of Web Development and Coding)",
            "Photography Basics and Beyond: From Smartphone to DSLR",
            "Machine Learning for Everyone",
            "Programming Languages, Part A",
            "English for Career Development",
            "Statistical Thinking for Data Science and Analytics",
            "Financial Engineering and Risk Management",
            "Responsive Website Development and Design",
            "The Data Science Course"
    );
    private static final List<String> subjects = Arrays.asList(
            "Техническая термодинамика",
            "Теория тепломассообмена",
            "Эксплуатация и вывод из эксплуатации ЯЭУ",
            "Теплообмен в ядерных энергетических установках",
            "Контроль и диагностика ядерных энергетических установок",
            "Вычислительная теплофизика",
            "Численные методы в теплофизике",
            "Атомные электрические станции: основы тепловых расчетов",
            "Радиохимия",
            "Расчетно-экспериментальные методы исследования процессов гидродинамики и теплообмена",
            "Ввод, вывод из эксплуатации объектов ядерного топливного цикла",
            "Энергооборудование АЭС",
            "Общая физика (механика)",
            "Ядерные технологии и экология топливного цикла",
            "Основы программирования на Python",
            "Компьютерный практикум",
            "Тепломассообмен",
            "Быстрые реакторы",
            "Ядерные реакторы нового поколения",
            "Теплогидравлические процессы",
            "Гидродинамика",
            "Инженерные расчеты",
            "Проектирование ядерных энергетических установок",
            "Язык Python в научных приложениях"
    );

    private static final List<String> littype = Arrays.asList(
            "учебник", "задачник", "учебное пособие", "методические материалы", "доп главы", "расширенный курс", "практикум");

    public static Textbook createBook(String lang){
        if(Objects.equals(lang, "english")){
            return createEngBook();
        } else if (Objects.equals(lang, "russian")) {
            return createRusBook();
        }
        else{
            return null;
        }
    }

    public static EnglishTextbook createEngBook(){
        Faker faker = new Faker();
        String englishSurname = faker.name().lastName();
        String universityName = faker.university().name();
        Random random = new Random();
        String course = courseraCourses.get(random.nextInt(courseraCourses.size()));
        int randomYear = random.nextInt(2023 - 1960 + 1) + 1960;
        String randomLevel = educationLevels.get(random.nextInt(educationLevels.size()));
        return new EnglishTextbook(universityName, course, englishSurname, randomYear, randomLevel);
    }

    public static RussianTextbook createRusBook(){
        Locale russianLocale = new Locale("ru");
        Faker faker = new Faker(russianLocale);
        String fakeSurname = faker.name().lastName();
        Random random = new Random();
        String sub = subjects.get(random.nextInt(subjects.size()));
        String litype = littype .get(random.nextInt(littype .size()));
        int randomYear = random.nextInt(2023 - 1960 + 1) + 1960;
        return new RussianTextbook(fakeSurname,  sub ,  litype, randomYear);
    }}