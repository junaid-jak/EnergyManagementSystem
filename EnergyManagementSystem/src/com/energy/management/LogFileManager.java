package com.energy.management;

import java.io.File;
import java.io.IOException;

public class LogFileManager {

    private static final String LOG_FILE_PATH = "logfile.txt";
    private static final String ARCHIVE_DIR = "archive";
    private static final String NEW_FOLDER = "newFolder";

    // Function to create a log file
    public static void createLogFile() {
        try {
            File file = new File(LOG_FILE_PATH);
            if (file.createNewFile()) {
                System.out.println("Log file created: " + file.getName());
            } else {
                System.out.println("Log file already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the log file.");
            e.printStackTrace();
        }
    }

    // Function to delete a log file
    public static void deleteLogFile() {
        File file = new File(LOG_FILE_PATH);
        if (file.delete()) {
            System.out.println("Log file deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the log file.");
        }
    }

    // Function to archive a log file (move to a different folder)
    public static void archiveLogFile() {
        File file = new File(LOG_FILE_PATH);
        File archiveDir = new File(ARCHIVE_DIR);

        if (!archiveDir.exists()) {
            archiveDir.mkdir();  // Create archive directory if not exists
        }

        File archivedFile = new File(archiveDir, "logfile.txt");
        if (file.renameTo(archivedFile)) {
            System.out.println("Log file archived.");
        } else {
            System.out.println("Failed to archive the log file.");
        }
    }

    // Function to move a log file to a new folder
    public static void moveLogFile() {
        File file = new File(LOG_FILE_PATH);
        File newLocation = new File(NEW_FOLDER, "logfile.txt");

        if (!newLocation.getParentFile().exists()) {
            newLocation.getParentFile().mkdirs();  // Create the new folder if not exists
        }

        if (file.renameTo(newLocation)) {
            System.out.println("Log file moved to new location.");
        } else {
            System.out.println("Failed to move the log file.");
        }
    }
}
