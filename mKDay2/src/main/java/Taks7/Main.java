package Taks7;

public class Main {
    public static void main(String[] args) {


        Gun gun = new Gun(6);
        checkIfGunLoaded(gun);

        gun.loadBullet("Bullet 1");
        gun.loadBullet("Bullet 2");
        gun.loadBullet("Bullet 3");
        gun.loadBullet("Bullet 4");
        gun.loadBullet("Bullet 5");
        gun.loadBullet("Bullet 6");
        gun.loadBullet("Bullet 7");


        checkIfGunLoaded(gun);
        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();
        gun.loadWithBullet(5);

    }

    private static void checkIfGunLoaded(Gun gun) {
        System.out.println("Broń naładowana " + gun.isLoaded());
    }


}



