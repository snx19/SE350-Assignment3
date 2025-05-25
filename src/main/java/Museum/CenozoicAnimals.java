package Museum;

/**
 * class Mammoth
 */
class Mammoth implements LandAnimal {
    /**
     * gets name
     * @return Mammoth
     */
    @Override
    public String getName() {return "Mammoth";}
    /**
     * gets walking
     * @return stomping
     */
    @Override
    public String getWalking() {return "stomping";}
}

/**
 * class CaveLion
 */
class CaveLion implements LandAnimal {
    /**
     * gets name
     * @return Cave lion
     */
    @Override
    public String getName() {return "Cave lion";}
    /**
     * gets walking
     * @return walking
     */
    @Override
    public String getWalking() {return "walking";}
}

/**
 * class Woolly Rhino
 */
class WoollyRhino implements LandAnimal {
    /**
     * gets name
     * @return Woolly rino
     */
    @Override
    public String getName() {return "Woolly rhino";}
    /**
     * gets walking
     * @return running
     */
    @Override
    public String getWalking() {return "running";}
}

/**
 * class Otodus
 */
class Otodus implements SeaAnimal {
    /**
     * gets name
     * @return name
     */
    @Override
    public String getName() {return "Otodus";}
    /**
     * gets swimming
     * @return hunting
     */
    @Override
    public String getSwimming() {return "hunting";}
}

/**
 * class whale
 */
class Whale implements SeaAnimal {
    /**
     * gets name
     * @return Whale
     */
    @Override
    public String getName() {return "Whale";}
    /**
     * gets swimming
     * @return swimming
     */
    @Override
    public String getSwimming() {return "swimming";}
}

/**
 * class Argentavis
 */
class Argentavis implements SkyAnimal {
    /**
     * gets name
     * @return Argentavis
     */
    @Override
    public String getName() {return "Argentavis";}

    /**
     * gets flying
     * @return flapping
     */
    @Override
    public String getFlying() {return "flapping";}
}

