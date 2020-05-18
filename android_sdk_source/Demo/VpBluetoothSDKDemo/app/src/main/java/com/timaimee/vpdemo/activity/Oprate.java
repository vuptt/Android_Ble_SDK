package com.timaimee.vpdemo.activity;

/**
 * Created by Administrator on 2017/11/25.
 */

public interface Oprate {
    public final static String PWD_COMFIRM = "1, Device password-verification";
    public final static String PERSONINFO_SYNC = "2. Personal Information-Settings";
    public final static String SETTING_FIRST = "<-first operate 1, 2";
    public final static String PWD_MODIFY = "Device Password-Modify";
    public final static String HEART_DETECT_START = "Measure Heart Rate-Start";
    public final static String HEART_DETECT_STOP = "Measure Heart Rate-End";
    public final static String BP_DETECT_START = "Measure Blood Pressure-Start";
    public final static String BP_DETECT_STOP = "Measure blood pressure-end";
    public final static String BP_DETECTMODEL_SETTING = "Blood Pressure Mode-Setting";
    public final static String BP_DETECTMODEL_SETTING_ADJUSTE = "Blood Pressure Mode [Dynamic Adjustment] -Setting";
    public final static String BP_DETECTMODEL_SETTING_ADJUSTE_CANCEL = "Blood Pressure Mode [Dynamic Adjustment] -Cancel";
    public final static String BP_DETECTMODEL_READ = "Blood Pressure Mode-Read";
    public final static String SPORT_CURRENT_READ = "current step count-read";
    public final static String CAMERA_START = "Camera Mode-Start";
    public final static String CAMERA_STOP = "Camera Mode-Stop";
    public final static String ALARM_SETTING = "Alarm clock-setting";
    public final static String ALARM_READ = "Alarm clock-read";
    public final static String ALARM_NEW_READ = "New Alarm-Read";
    public final static String ALARM_NEW_ADD = "New alarm clock-add";
    public final static String ALARM_NEW_MODIFY = "New Alarm-Modify";
    public final static String ALARM_NEW_DELETE = "New Alarm-Delete";
    public final static String LONGSEAT_SETTING_OPEN = "Sedentary-Open";
    public final static String LONGSEAT_SETTING_CLOSE = "Sedentary-Close";
    public final static String LONGSEAT_READ = "Sedentary-Read";
    public final static String LANGUAGE_CHINESE = "Language Setting-Chinese";
    public final static String LANGUAGE_ENGLISH = "Language Setting-English";
    public final static String BATTERY = "Battery status-read";
    public final static String NIGHT_TURN_WRIST_OPEN = "Turn wrist at night-open";
    public final static String NIGHT_TURN_WRIST_CLOSE = "Turn wrist at night-close";
    public final static String NIGHT_TURN_WRIST_READ = "Night Turn Wrist-Read";
    public final static String NIGHT_TURN_WRIST_CUSTOM_TIME = "Turn wrist at night-custom time";
    public final static String NIGHT_TURN_WRIST_CUSTOM_TIME_LEVEL = "Turn wrist at night-custom time and level";
    public final static String FINDPHONE = "Mobile phone anti-lost";
    public final static String CHECK_WEAR_SETING_OPEN = "Wear detection-open";
    public final static String CHECK_WEAR_SETING_CLOSE = "Wear detection-close";
    public final static String FINDDEVICE_SETTING_OPEN = "Device anti-lost-open";
    public final static String FINDDEVICE_SETTING_CLOSE = "Anti-lost device-off";
    public final static String FINDDEVICE_READ = "Device anti-lost-read";
    public final static String DEVICE_COUSTOM_READ = "Personalization-Reading";
    public final static String DEVICE_COUSTOM_SETTING = "Personalization-Setting";
    public final static String SOCIAL_MSG_SETTING = "Social Message Reminder-Setting";
    public final static String SOCIAL_MSG_READ = "Social message reminder-read settings";
    public final static String SOCIAL_MSG_SEND = "Social Message Reminder-Send Content";
    public final static String SOCIAL_PHONE_IDLE_OR_OFFHOOK = "Social message reminder-received call";
    public final static String DEVICE_CONTROL_PHONE = "Monitor bracelet-hang up, mute";
    public final static String HEARTWRING_READ = "Heart rate alarm-read";
    public final static String HEARTWRING_OPEN = "Heart Rate Alarm-Open";
    public final static String HEARTWRING_CLOSE = "Heart rate alarm-closed";
    public final static String SPO2H_OPEN = "Blood Oxygen-Read";
    public final static String SPO2H_CLOSE = "Blood Oxygen-End";
    public final static String SPO2H_AUTO_DETECT_READ = "Automatic blood oxygen detection-reading";
    public final static String SPO2H_AUTO_DETECT_OPEN = "Blood Oxygen Automatic Detection-Open";
    public final static String SPO2H_AUTO_DETECT_CLOSE = "Blood Oxygen Automatic Detection-Closed";
    public final static String FATIGUE_OPEN = "Fatigue-Read";
    public final static String FATIGUE_CLOSE = "Fatigue-End";
    public final static String WOMEN_SETTING = "Female status-setting";
    public final static String WOMEN_READ = "Female status-read";
    public final static String COUNT_DOWN_WATCH = "Countdown-watch used alone";
    public final static String COUNT_DOWN_APP = "Countdown-App Use";
    public final static String COUNT_DOWN_APP_READ = "Countdown-Read";
    public final static String SCREEN_LIGHT_SETTING = "Screen Adjustment-Setting";
    public final static String SCREEN_LIGHT_READ = "Screen Adjustment-Read";
    public final static String SCREEN_STYLE_READ = "Screen Style-Read";
    public final static String SCREEN_STYLE_SETTING = "Screen Style-Setting";
    public final static String AIM_SPROT_CALC = "Target Steps-Calculation";
    public final static String INSTITUTION_TRANSLATION = "Metric and English conversion";
    public final static String READ_HEALTH_DRINK = "Read health data-drinking";
    public final static String READ_HEALTH_SLEEP = "Read health data-sleep";
    public final static String READ_HEALTH_SLEEP_FROM = "Read health data-sleep-from what day";
    public final static String READ_HEALTH_SLEEP_SINGLEDAY = "Read health data-sleep-read this day";
    public final static String READ_HEALTH_ORIGINAL = "Read health data-5 minutes";
    public final static String READ_HEALTH_ORIGINAL_FROM = "Read health data-from what day";
    public final static String READ_HEALTH_ORIGINAL_SINGLEDAY = "Read health data-read this day";
    public final static String READ_HEALTH = "Read health data-all";
    public final static String OAD = "Firmware Upgrade";
    public final static String SHOW_SP = "Show sp";
    public final static String SPORT_MODE_ORIGIN_READ = "Read data-sport mode";
    public final static String SPORT_MODE_ORIGIN_READSTAUTS = "Read status-sport mode";
    public final static String SPORT_MODE_ORIGIN_START = "On-Sport Mode";
    public final static String SPORT_MODE_ORIGIN_END = "End-Sports Mode";
    public final static String SPO2H_ORIGIN_READ = "Read data-blood oxygen data";
    public final static String HRV_ORIGIN_READ = "Read data-HRV data";
    public final static String CLEAR_DEVICE_DATA = "Clear Data";
    public final static String DISCONNECT = "Bluetooth connection-disconnect";
    public final static String DETECT_PTT = "PTT";
    public final static String DETECT_START_ECG = "Start measuring ECG";
    public final static String DETECT_STOP_ECG = "End Measurement ECG";
    public final static String LOW_POWER_READ = "Low power consumption-read";
    public final static String LOW_POWER_OPEN = "Low Power Consumption-On";
    public final static String LOW_POWER_CLOSE = "Low Power-Off";
    public final static String S22_READ_DATA = "S22-Data Reading";
    public final static String S22_READ_STATE = "S22-state read";
    public final static String S22_SETTING_STATE_OPEN = "S22-State Setting (On)";
    public final static String S22_SETTING_STATE_CLOSE = "S22-State Setting (Off)";
    public final static String NONE = "NONE";
    public final static String[] oprateStr = new String[]{
            PWD_COMFIRM, PERSONINFO_SYNC, SETTING_FIRST, PWD_MODIFY,
            HEART_DETECT_START, HEART_DETECT_STOP, BP_DETECT_START, BP_DETECT_STOP, BP_DETECTMODEL_SETTING, BP_DETECTMODEL_READ,
            BP_DETECTMODEL_SETTING_ADJUSTE_CANCEL, BP_DETECTMODEL_SETTING_ADJUSTE,
            SPORT_CURRENT_READ, CAMERA_START, CAMERA_STOP, ALARM_SETTING, ALARM_READ, ALARM_NEW_READ, ALARM_NEW_ADD, ALARM_NEW_MODIFY, ALARM_NEW_DELETE,
            LONGSEAT_SETTING_OPEN, LONGSEAT_SETTING_CLOSE, LONGSEAT_READ, LANGUAGE_CHINESE, LANGUAGE_ENGLISH,
            BATTERY, NIGHT_TURN_WRIST_OPEN, NIGHT_TURN_WRIST_CLOSE, NIGHT_TURN_WRIST_READ, NIGHT_TURN_WRIST_CUSTOM_TIME, NIGHT_TURN_WRIST_CUSTOM_TIME_LEVEL,
            DEVICE_COUSTOM_READ, DEVICE_COUSTOM_SETTING, FINDPHONE,
            CHECK_WEAR_SETING_OPEN, CHECK_WEAR_SETING_CLOSE,
            FINDDEVICE_SETTING_OPEN, FINDDEVICE_SETTING_CLOSE, FINDDEVICE_READ,
            SOCIAL_MSG_SETTING, SOCIAL_MSG_READ, SOCIAL_MSG_SEND, DEVICE_CONTROL_PHONE, SOCIAL_PHONE_IDLE_OR_OFFHOOK, HEARTWRING_READ, HEARTWRING_OPEN, HEARTWRING_CLOSE,
            SPO2H_OPEN, SPO2H_CLOSE, SPO2H_AUTO_DETECT_READ, SPO2H_AUTO_DETECT_OPEN, SPO2H_AUTO_DETECT_CLOSE, FATIGUE_OPEN, FATIGUE_CLOSE, WOMEN_SETTING, WOMEN_READ, COUNT_DOWN_WATCH, COUNT_DOWN_APP, COUNT_DOWN_APP_READ, SCREEN_LIGHT_SETTING, SCREEN_LIGHT_READ, SCREEN_STYLE_READ, SCREEN_STYLE_SETTING, AIM_SPROT_CALC, INSTITUTION_TRANSLATION,
            READ_HEALTH_SLEEP, READ_HEALTH_SLEEP_FROM, READ_HEALTH_SLEEP_SINGLEDAY, READ_HEALTH_DRINK, READ_HEALTH_ORIGINAL,
            READ_HEALTH_ORIGINAL_FROM, READ_HEALTH_ORIGINAL_SINGLEDAY, READ_HEALTH,
            OAD, SHOW_SP, SPORT_MODE_ORIGIN_READ, SPORT_MODE_ORIGIN_READSTAUTS, SPORT_MODE_ORIGIN_START, SPORT_MODE_ORIGIN_END, SPO2H_ORIGIN_READ, HRV_ORIGIN_READ, CLEAR_DEVICE_DATA, DISCONNECT
            , DETECT_START_ECG, DETECT_STOP_ECG, NONE, LOW_POWER_READ, LOW_POWER_OPEN, LOW_POWER_CLOSE,S22_READ_DATA,S22_READ_STATE,S22_SETTING_STATE_OPEN,S22_SETTING_STATE_CLOSE,DETECT_PTT
    };
}
