package Museum;

/**
 * class Stegosaurus
 */
class Stegosaurus implements LandAnimal {
    @Override
    /**
     * gets name
     * @return Stegosaurus
     */
    public String getName() {return "Stegosaurus";}
    @Override
    /**
     * gets walking
     * @return stomping
     */
    public String getWalking() {return "stomping";}
}

/**
 * class Plesiosaurus
 */
class Plesiosaurus implements SeaAnimal {
    @Override
    /**
     * gets name
     * @return Plesiosaurus
     */
    public String getName() {return "Plesiosaurus";}
    @Override
    /**
     * gets swimming
     * @return accelerating
     */
    public String getSwimming() {return "accelerating";}
}

/**
 * class Pterodactylus
 */
class Pterodactylus implements SkyAnimal {
    @Override
    /**
     * gets name
     * returns Pterodactylus
     */
    public String getName() {return "Pterodactylus";}
    @Override
    /**
     * gets flying
     * @return gliding
     */
    public String getFlying() {
        return "gliding";
    }
}
