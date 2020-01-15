package com.indrasoft;

public enum Module {
    ABOUT(new String[]{"about"}, "About APPS"),
    ADJUST_DELTAS(new String[]{"adjustdeltas"}, "Adjust Deltas"),
    ADJUST_MODEL_DELTAS(new String[]{"adjustmodeldeltas"}, "Adjust Model Deltas"),
    ADJUST_RQMTS(new String[]{"adjustrqmts", "requirement"}, "Adjust Requirements"),
    ALERT(new String[]{"alert"}, "Alert"),
    ALLOCATION(new String[]{"allocation"}, "Allocation"),
    ASSET_MGMT(new String[]{"assetmgmt"}, "Attachment Management"),
    CCN_MGMT(new String[]{"ccnmgmt"}, "CCN (Change Control Number) Management"),
    COSTCAT_MGMT(new String[]{"costcatmgmt"}, "COSTCAT (Cost Category) Management"),
    DEFER_DELTAS(new String[]{"deferdeltas"}, "Defer POM Issue Deltas"),
    DRILL_FIELD_COPY(new String[]{"drillfieldcopy"}, "Execution Drill Field Copy"),
    DRILL_MGMT(new String[]{"drillmgmt"}, "Execution Drill/BOGEY Management"),
    EMAIL(new String[]{"email", "mail"}, "Email"),
    EXECUTION(new String[]{"executionissue", "apps.execution."}, "Execution Issue"),
    EXECUTION_RQMT(new String[]{"executionrqmt"}, "Execution Requirement"),
    EXERCISE_MGMT(new String[]{"exercisemgmt", "data.exercise", "data.obrc", "data.fydp", "admin.exercise"}, "Programming Exercise Management"),
    HELP(new String[]{"onlinereference", "pdf", "help"}, "Online Help Documentation"),
    LOOKUP_MGMT(new String[]{"lookupmgmt", "lookup"}, "Lookup Management"),
    OBAN_MGMT(new String[]{"obanmgmt"}, "OBAN Management"),
    PANEL_PRESENTATION(new String[]{"panelpresentation"}, "Panel Presentation"),
    PASSWORD(new String[]{"password"}, "Change Password"),
    PERMISSION_MGMT(new String[]{"permissionmgmt", "permission"}, "Execution Permission Management"),
    PE_MGMT(new String[]{"pemgmt"}, "PE (Program Element) Management"),
    PLANNING_CHOICE(new String[]{"planningchoice"}, "Planning Choice"),
    PLANNING_YR_MGMT(new String[]{"planningyearmgmt", "planningyear"}, "Planning Year Management"),
    POM_ISSUE(new String[]{"pom"}, "POM Issue"),
    PROGRAM_SUMMARY(new String[]{"programsummary"}, "Program Summary"),
    QUERY(new String[]{"query"}, "Query"),
    RATE_MGMT(new String[]{"ratemgmt"}, "Rate Management"),
    RCCC_XREF(new String[]{"rcccxrefmgmt"}, "RCCC Cross-Reference"),
    REALM(new String[]{"realm"}, "Login Security"),
    RESOURCE_COMBO(new String[]{"resourcecombo", "resources"}, "Resource Combination Management"),
    RESOURCE_ISSUE(new String[]{"resourceissue", "rqmtvalidation"}, "Resource Issue"),
    RESOURCE_XFER(new String[]{"resourcetransfer"}, "Resource Transfer"),
    USER_PROFILE(new String[]{"userprofile"}, "User Profile"),
    USER_MGMT(new String[]{"usermgmt", "data.user", "useradmin"}, "User Management"),
    WSC_MGMT(new String[]{"wscmgmt"}, "WSC (Weapon System Code) Management"),
    SERVICES(new String[]{"services"}, "APPS System-Wide Services"),
    UPDATER(new String[]{"updater"}, "APPS Software Updater"),
    REPORTS(new String[]{"reports"}, "Reports"),
    DESKTOP(new String[]{"desktop"}, "APPS Desktop"),
    LOGIN(new String[]{"login"}, "APPS User Login"),
    CONSTANTS(new String[]{"constants"}, "APPS System-Wide Constants"),
    COMMONGUI(new String[]{"commongui"}, "APPS System-Wide Graphical User Interface Components"),
    UTILITIES(new String[]{"util"}, "APPS System-Wide Utilities");

    private String[] matchTerms;
    private String moduleName;

    Module(String[] matches, String moduleName) {
        this.matchTerms = matches;
        this.moduleName = moduleName;
    }

    public static Module getModule(String fqcn) {
        for (Module module : Module.values()) {
            if (module.matches(fqcn)) {
                return module;
            }
        }

        return null;
    }

    public String getModuleName() {
        return this.moduleName;
    }

    public boolean matches(String fqcn) {
        String lowercase = fqcn.toLowerCase();
        for (String possible : this.matchTerms) {
            if (lowercase.contains(possible))
                return true;
        }

        return false;
    }
}
