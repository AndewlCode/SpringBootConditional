package ru.netology.springbootconditional.Classes;

import ru.netology.springbootconditional.Interfaces.SystemProfile;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}
