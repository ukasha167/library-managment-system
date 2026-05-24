import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textStudentName;
    private JTextField textRollNumber;
    private JTextField textBookTitle;
    private JTextField textIssueDate;
    private JTextField textReturnDate;
    private JComboBox<String> comboBoxBookSelection;
    private javax.swing.ButtonGroup editionGroup;
    private JTextArea textAreaRemarks;

    public static void main(String[] args) {
        try {
            Main frame = new Main();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("MyFrame initialization completed");
        }
    }

    public Main() {
        setTitle("Library Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(100, 100, 500, 620);
        contentPane = new JPanel();
        contentPane.setForeground(Color.GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel labelTitle = new JLabel("Library Management System");
        labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
        labelTitle.setFont(new Font("Lucida Grande", Font.BOLD, 18));
        labelTitle.setBounds(45, 25, 400, 30);
        contentPane.add(labelTitle);

        JLabel labelStudentName = new JLabel("Student Name:");
        labelStudentName.setFont(new Font("Tahoma", Font.BOLD, 14));
        labelStudentName.setBounds(45, 80, 140, 30);
        contentPane.add(labelStudentName);

        textStudentName = new JTextField();
        textStudentName.setForeground(Color.GRAY);
        textStudentName.setText("e.g., Ali Ahmed");
        textStudentName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textStudentName.setBounds(200, 80, 245, 30);
        contentPane.add(textStudentName);
        textStudentName.setColumns(10);

        JLabel labelRollNumber = new JLabel("Roll Number :");
        labelRollNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
        labelRollNumber.setBounds(45, 130, 140, 30);
        contentPane.add(labelRollNumber);

        textRollNumber = new JTextField();
        textRollNumber.setForeground(Color.GRAY);
        textRollNumber.setText("e.g., 0146");
        textRollNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textRollNumber.setBounds(200, 130, 245, 30);
        contentPane.add(textRollNumber);
        textRollNumber.setColumns(10);

        JLabel labelBookTitle = new JLabel("Book Title:");
        labelBookTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
        labelBookTitle.setBounds(45, 180, 140, 30);
        contentPane.add(labelBookTitle);

        textBookTitle = new JTextField();
        textBookTitle.setForeground(Color.GRAY);
        textBookTitle.setText("e.g., Head First Java");
        textBookTitle.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textBookTitle.setBounds(200, 180, 245, 30);
        contentPane.add(textBookTitle);
        textBookTitle.setColumns(10);

        JLabel labelBookCategory = new JLabel("Book Category:");
        labelBookCategory.setFont(new Font("Tahoma", Font.BOLD, 14));
        labelBookCategory.setBounds(45, 230, 140, 30);
        contentPane.add(labelBookCategory);

        comboBoxBookSelection = new JComboBox<String>();
        comboBoxBookSelection.setModel(new DefaultComboBoxModel<String>(
                new String[] { "Select a Book", "Programming", "AI", "Databases", "Networking" }));
        comboBoxBookSelection.setFont(new Font("Tahoma", Font.PLAIN, 14));
        comboBoxBookSelection.setBounds(200, 230, 245, 30);
        contentPane.add(comboBoxBookSelection);

        JLabel labelIssueDate = new JLabel("Issue Date:");
        labelIssueDate.setFont(new Font("Tahoma", Font.BOLD, 14));
        labelIssueDate.setBounds(45, 280, 140, 30);
        contentPane.add(labelIssueDate);

        textIssueDate = new JTextField();
        textIssueDate.setForeground(Color.GRAY);
        textIssueDate.setText("e.g., 11/05/2026");
        textIssueDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textIssueDate.setBounds(200, 280, 245, 30);
        contentPane.add(textIssueDate);
        textIssueDate.setColumns(10);

        JLabel labelReturnDate = new JLabel("Return Date:");
        labelReturnDate.setFont(new Font("Tahoma", Font.BOLD, 14));
        labelReturnDate.setBounds(45, 330, 140, 30);
        contentPane.add(labelReturnDate);

        textReturnDate = new JTextField();
        textReturnDate.setForeground(Color.GRAY);
        textReturnDate.setText("e.g., 25/05/2026");
        textReturnDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textReturnDate.setBounds(200, 330, 245, 30);
        contentPane.add(textReturnDate);
        textReturnDate.setColumns(10);

        JLabel labelBookRemarks = new JLabel("Remarks (Optional)");
        labelBookRemarks.setFont(new Font("Tahoma", Font.BOLD, 14));
        labelBookRemarks.setBounds(45, 380, 142, 30);
        contentPane.add(labelBookRemarks);

        textAreaRemarks = new JTextArea();
        textAreaRemarks.setFont(new Font("Tahoma", Font.PLAIN, 14));
        textAreaRemarks.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        textAreaRemarks.setBounds(200, 380, 245, 60);
        contentPane.add(textAreaRemarks);

        JLabel labelEdition = new JLabel("Edition:");
        labelEdition.setFont(new Font("Tahoma", Font.BOLD, 14));
        labelEdition.setBounds(45, 460, 140, 30);
        contentPane.add(labelEdition);

        JRadioButton radioButtonNew = new JRadioButton("New");
        radioButtonNew.setFont(new Font("Tahoma", Font.PLAIN, 14));
        radioButtonNew.setBounds(200, 460, 70, 30);
        contentPane.add(radioButtonNew);

        JRadioButton radioButtonOldEdition = new JRadioButton("Old");
        radioButtonOldEdition.setFont(new Font("Tahoma", Font.PLAIN, 14));
        radioButtonOldEdition.setBounds(280, 460, 70, 30);
        contentPane.add(radioButtonOldEdition);

        editionGroup = new javax.swing.ButtonGroup();
        editionGroup.add(radioButtonNew);
        editionGroup.add(radioButtonOldEdition);

        JButton buttonIssueBook = new JButton("Issue Book");
        buttonIssueBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (validateInput()) {
                    String name = textStudentName.getText().trim();
                    String roll = textRollNumber.getText().trim();
                    String title = textBookTitle.getText().trim();
                    String category = comboBoxBookSelection.getSelectedItem().toString();
                    String issueDate = textIssueDate.getText().trim();
                    String returnDate = textReturnDate.getText().trim();

                    String summaryMessage = "Successfully Issued Book!\n\n"
                            + "Student Name: " + name + "\n"
                            + "Roll Number: " + roll + "\n"
                            + "Book Title: " + title + "\n"
                            + "Category: " + category + "\n"
                            + "Issue Date: " + issueDate + "\n"
                            + "Return Date: " + returnDate;

                    JOptionPane.showMessageDialog(contentPane, summaryMessage, "Issue Summary",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(contentPane, "Submission Failed", "Issue Summary",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonIssueBook.setFont(new Font("Tahoma", Font.PLAIN, 14));
        buttonIssueBook.setBounds(45, 520, 120, 35);
        contentPane.add(buttonIssueBook);

        JButton buttonReset = new JButton("Reset");
        buttonReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textStudentName.setText("e.g., Ali Ahmed");
                textRollNumber.setText("e.g., 0146");
                textBookTitle.setText("e.g., Head First Java");
                textIssueDate.setText("e.g., 11/05/2026");
                textReturnDate.setText("e.g., 25/05/2026");
                comboBoxBookSelection.setSelectedIndex(0);
                editionGroup.clearSelection();
                textAreaRemarks.setText("");
            }
        });
        buttonReset.setFont(new Font("Tahoma", Font.PLAIN, 14));
        buttonReset.setBounds(185, 520, 110, 35);
        contentPane.add(buttonReset);

        JButton buttonExit = new JButton("Exit");
        buttonExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        buttonExit.setFont(new Font("Tahoma", Font.PLAIN, 14));
        buttonExit.setBounds(315, 520, 130, 35);
        contentPane.add(buttonExit);
    }

    private boolean validateInput() {
        try {
            String name = textStudentName.getText().trim();
            if (name.isEmpty() || name.equals("e.g., Ali Ahmed")) {
                throw new EmptyFieldException("Name is empty or has placeholder text");
            }

            String roll = textRollNumber.getText().trim();
            if (roll.isEmpty() || roll.equals("e.g., 0146")) {
                throw new EmptyFieldException("Roll number is empty or has placeholder text");
            }
            if (!roll.matches("[0-9]+")) {
                throw new InvalidRollNumberException("Roll number can only contain numbers.");
            }

            String title = textBookTitle.getText().trim();
            if (title.isEmpty() || title.equals("e.g., Head First Java")) {
                throw new EmptyFieldException("Book title is empty or has placeholder text");
            }

            if (comboBoxBookSelection.getSelectedIndex() == 0) {
                throw new NullSelectionException("Please select a valid Book Category.");
            }

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            String issueDate = textIssueDate.getText().trim();
            if (issueDate.isEmpty() || issueDate.equals("e.g., 11/05/2026")) {
                throw new EmptyFieldException("Issue date is empty or has placeholder text");
            }
            LocalDate parsedIssueDate;
            try {
                parsedIssueDate = LocalDate.parse(issueDate, formatter);
            } catch (Exception e) {
                throw new NumberFormatException("Issue date must be in the format DD/MM/YYYY.");
            }

            String returnDate = textReturnDate.getText().trim();
            if (returnDate.isEmpty() || returnDate.equals("e.g., 25/05/2026")) {
                throw new EmptyFieldException("Return date is empty or has placeholder text");
            }
            LocalDate parsedReturnDate;
            try {
                parsedReturnDate = LocalDate.parse(returnDate, formatter);
            } catch (Exception e) {
                throw new NumberFormatException("Return date must be in the format DD/MM/YYYY.");
            }

            if (parsedReturnDate.isBefore(parsedIssueDate)) {
                throw new InvalidDateException("Return date cannot be earlier than the issue date");
            }

            if (editionGroup.getSelection() == null) {
                throw new NullSelectionException("No Edition selected");
            }
            return true;
        } catch (EmptyFieldException e) {
            JOptionPane.showMessageDialog(contentPane, e.getMessage(), "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (InvalidRollNumberException e) {
            JOptionPane.showMessageDialog(contentPane, e.getMessage(), "Validation Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(contentPane, e.getMessage(),
                    "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (InvalidDateException e) {
            JOptionPane.showMessageDialog(contentPane, e.getMessage(),
                    "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (NullSelectionException e) {
            JOptionPane.showMessageDialog(contentPane, e.getMessage(),
                    "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            System.out.println("Validation input logic execution finalized.");
        }
    }

    public static class EmptyFieldException extends Exception {
        public EmptyFieldException(String message) {
            super(message);
        }
    }

    public static class InvalidRollNumberException extends Exception {
        public InvalidRollNumberException(String message) {
            super(message);
        }
    }

    public static class InvalidDateException extends Exception {
        public InvalidDateException(String message) {
            super(message);
        }
    }

    public static class NullSelectionException extends Exception {
        public NullSelectionException(String message) {
            super(message);
        }
    }
}
