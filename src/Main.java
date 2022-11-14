import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Computer pcArray[] = new Computer[5];
        Monitor mrArray[] = new Monitor[5];
        Mouse msArray[] = new Mouse[5];
        Keyboard kbArray[] = new Keyboard[5];
        VideoCard vcArray[] = new VideoCard[5];
        CPU cpuArray[] = new CPU[5];
        Monitor mr = new Monitor("LG", 0, 0, 0);
        Mouse ms = new Mouse("XY", 0, 0);
        Keyboard kb = new Keyboard("SVEN", 0, 0);
        VideoCard vc = new VideoCard("GTX", 0, 0.0, 0, 0);
        CPU cpu = new CPU("SUPERPUPER", 0, 0, 0);
        System.out.println("Приветствую вас в нашем онлайн магазине, по выбранным фильтрам вам подойдёт данный компьютер:");

        mrArray[0] = new Monitor(" 1 - LG", 0, 0, 0);
        mrArray[1] = new Monitor(" 2 - SAMSUNG", 0, 0, 0);
        mrArray[2] = new Monitor(" 3 - fav", 0, 0, 0);
        mrArray[3] = new Monitor(" 4 - rfgs", 0, 0, 0);
        mrArray[4] = new Monitor(" 5 - sdg", 0, 0, 0);

        msArray[0] = new Mouse(" 1 - vra", 0, 0);
        msArray[1] = new Mouse(" 2 - vearv", 0, 0);
        msArray[2] = new Mouse(" 3 - zrg", 0, 0);
        msArray[3] = new Mouse(" 4 - brt", 0, 0);
        msArray[4] = new Mouse(" 5 - urjm", 0, 0);

        kbArray[0] = new Keyboard(" 1 - rdver", 0, 0);
        kbArray[1] = new Keyboard(" 2 - thg", 0, 0);
        kbArray[2] = new Keyboard(" 3 - fvfsg", 0, 0);
        kbArray[3] = new Keyboard(" 4 - tyeh", 0, 0);
        kbArray[4] = new Keyboard(" 5 - erf", 0, 0);

        vcArray[0] = new VideoCard(" 1 - srg", 0, 0.0, 0, 0);
        vcArray[1] = new VideoCard(" 2 - wet", 0, 0.0, 0, 0);
        vcArray[2] = new VideoCard(" 3 - reger", 0, 0.0, 0, 0);
        vcArray[3] = new VideoCard(" 4 - aerg", 0, 0.0, 0, 0);
        vcArray[4] = new VideoCard(" 5 - g5g", 0, 0.0, 0, 0);

        cpuArray[0] = new CPU(" 1 - erg", 0, 0, 0);
        cpuArray[1] = new CPU(" 2 - wrtg", 0, 0, 0);
        cpuArray[2] = new CPU(" 3 - serg", 0, 0, 0);
        cpuArray[3] = new CPU(" 4 - weg", 0, 0, 0);
        cpuArray[4] = new CPU(" 5 - earg", 0, 0, 0);

        pcArray[0] = new Computer("pc1", mrArray[0], msArray[0], kbArray[0], vcArray[0], cpuArray[0]);
        pcArray[1] = new Computer("pc1", mrArray[1], msArray[1], kbArray[1], vcArray[1], cpuArray[1]);
        pcArray[2] = new Computer("pc1", mrArray[2], msArray[2], kbArray[2], vcArray[2], cpuArray[2]);
        pcArray[3] = new Computer("pc1", mrArray[3], msArray[3], kbArray[3], vcArray[3], cpuArray[3]);
        pcArray[4] = new Computer("pc1", mrArray[4], msArray[4], kbArray[4], vcArray[4], cpuArray[4]);

        System.out.println(Arrays.toString(pcArray) + "\n");
        System.out.println("Если вам понравился данный компьютер, нажмите 1 и мы доставим его к вам домой." + "\nНо если же вам не нравятся некоторые составляющее компьютера, нажмите 2 и мы сможем предложить вам другие варианты:");
        int num = sc.nextInt();
        while (num != 1) {
            if (num == 2) {
                System.out.println("Хорошо, что-бы вы хотели изменить в данном компьютере: \n" + "1 - Монитор" + "\n2 - Компьютерная мышь\n" + "3 - Клавиатура" + "\n4 - Видео карта" + "\n5 - Процессор");
            } else
                System.out.println("Извините вы указали неверную цифру, попробуйте ещё раз и прочитайте условия по вниметельней :)");
            int num2 = scan.nextInt();
            if (num2 == 1) {
                System.out.println("Мы можем предложить 5 мониторов от разных компаний с разными характеристиками, вот они:");
                System.out.println(Arrays.toString(mrArray));
            } else if (num2 == 2) {
                System.out.println("Мы можем предложить 5 компьютерных мышек от разных компаний с разными характеристиками, вот они:");
                System.out.println(Arrays.toString(msArray));
            } else if (num2 == 3) {
                System.out.println("Мы можем предложить 5 клавиатур от разных компаний с разными характеристиками,вот они:");
                System.out.println(Arrays.toString(kbArray));
            } else if (num2 == 4) {
                System.out.println("Мы можем предложить 5 видео карт от разных компаний с разными характеристиками,вот они:");
                System.out.println(Arrays.toString(vcArray));
            } else if (num2 == 5) {
                System.out.println("Мы можем предложить 5 процессоров от разных компаний с разными характеристиками вот они, вот они:");
                System.out.println(Arrays.toString(cpuArray));
            } else
                System.out.println("Извините вы указали неверную цифру, попробуйте ещё раз и прочитайте условия по вниметельней :)");
            System.out.println("Каждая модель подписана по цифрам и даны характеристики, пожалуйста выберите число, соответсвующее нумерации выше, тем самым выбрав подходящую для вас модель: \n");
            int num3 = scanner.nextInt();
            switch (num2) {
                case 1:
                    switch (num3) {
                        case 1:
                            mr = mrArray[0];
                            pcArray[0] = new Computer("Your pc", mr, ms, kb, vc, cpu);
                            break;
                        case 2:
                            mr = mrArray[1];
                            pcArray[0] = new Computer("Your pc", mr, ms, kb, vc, cpu);
                            break;
                        case 3:
                            mr = mrArray[2];
                            pcArray[0] = new Computer("Your pc", mr, ms, kb, vc, cpu);
                            break;
                        case 4:
                            mr = mrArray[3];
                            pcArray[0] = new Computer("Your pc", mr, ms, kb, vc, cpu);
                            break;
                        case 5:
                            mr = mrArray[4];
                            pcArray[0] = new Computer("Your pc", mr, ms, kb, vc, cpu);
                            break;
                    }
                    break;
                case 2:
                    switch (num3) {
                        case 1:
                            ms = msArray[0];
                            pcArray[0] = new Computer("Your pc", mr, ms, kb, vc, cpu);
                            break;
                        case 2:
                            ms = msArray[1];
                            pcArray[0] = new Computer("Your pc", mr, ms, kb, vc, cpu);
                            break;
                        case 3:
                            ms = msArray[2];
                            pcArray[0] = new Computer("Your pc", mr, ms, kb, vc, cpu);
                            break;
                        case 4:
                            ms = msArray[3];
                            pcArray[0] = new Computer("Your pc", mr, ms, kb, vc, cpu);
                            break;
                        case 5:
                            ms = msArray[4];
                            pcArray[0] = new Computer("Your pc", mr, ms, kb, vc, cpu);
                            break;
                    }
                    break;
                case 3:
                    switch (num3) {
                        case 1:
                            kb = kbArray[0];
                            pcArray[0] = new Computer("Your pc", mr, ms, kb, vc, cpu);
                            break;
                        case 2:
                            kb = kbArray[1];
                            pcArray[0] = new Computer("Your pc", mr, ms, kb, vc, cpu);
                            break;
                        case 3:
                            kb = kbArray[2];
                            pcArray[0] = new Computer("Your pc", mr, ms, kb, vc, cpu);
                            break;
                        case 4:
                            kb = kbArray[3];
                            pcArray[0] = new Computer("Your pc", mr, ms, kb, vc, cpu);
                            break;
                        case 5:
                            kb = kbArray[4];
                            pcArray[0] = new Computer("Your pc", mr, ms, kb, vc, cpu);
                            break;
                    }
                    break;
                case 4:
                    switch (num3) {
                        case 1:
                            vc = vcArray[0];
                            pcArray[0] = new Computer("Your pc", mr, ms, kb, vc, cpu);
                            break;
                        case 2:
                            vc = vcArray[1];
                            pcArray[0] = new Computer("Your pc", mr, ms, kb, vc, cpu);
                            break;
                        case 3:
                            vc = vcArray[2];
                            pcArray[0] = new Computer("Your pc", mr, ms, kb, vc, cpu);
                            break;
                        case 4:
                            vc = vcArray[3];
                            pcArray[0] = new Computer("Your pc", mr, ms, kb, vc, cpu);
                            break;
                        case 5:
                            vc = vcArray[4];
                            pcArray[0] = new Computer("Your pc", mr, ms, kb, vc, cpu);
                            break;

                    }
                    break;
                case 5:
                    switch (num3) {
                        case 1:
                            cpu = cpuArray[0];
                            pcArray[0] = new Computer("Your pc",mr,ms,kb,vc,cpu);
                            break;
                        case 2:
                            cpu = cpuArray[1];
                            pcArray[0] = new Computer("Your pc",mr,ms,kb,vc,cpu);
                            break;
                        case 3:
                            cpu = cpuArray[2];
                            pcArray[0] = new Computer("Your pc",mr,ms,kb,vc,cpu);
                            break;
                        case 4:
                            cpu = cpuArray[3];
                            pcArray[0] = new Computer("Your pc",mr,ms,kb,vc,cpu);
                            break;
                        case 5:
                            cpu = cpuArray[4];
                            pcArray[0] = new Computer("Your pc",mr,ms,kb,vc,cpu);
                            break;
                    }
                    break;
            }
            System.out.println(pcArray[0]);
            System.out.print("Отлично, мы рады что вы смогли найти то, что вам нужно, нажмите 1 если хотите завершить покупку, но если вы хотите поменять другие детали нажмите 2:");
            int num4 = sc2.nextInt();
            if (num4 == 1) {
                System.out.println("Спасибо за покупку!");
                break;
            } else if (num4 == 2) ;
            else
                System.out.println("Извините вы указали неверную цифру, попробуйте ещё раз и прочитайте условия по вниметельней :)");

        }

    }
}











