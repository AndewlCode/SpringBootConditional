package ru.netology.springbootconditional.Classes;

import ru.netology.springbootconditional.Interfaces.SystemProfile;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
