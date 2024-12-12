import javax.swing.*;
import java.awt.event.*;

public class Login {
    // Definimos los componentes de la interfaz gráfica
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    // Simulamos un usuario y contraseña correctos
    private static final String USERNAME = "mendara";
    private static final String PASSWORD = "Leito_2015";

    public Login() {
        // Configuración de la ventana principal
        frame = new JFrame("Login");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Usamos el layout nulo para colocar los componentes manualmente

        // Campo de nombre de usuario
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(10, 20, 80, 25);
        frame.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(100, 20, 165, 25);
        frame.add(usernameField);

        // Campo de contraseña
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        frame.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(100, 50, 165, 25);
        frame.add(passwordField);

        // Botón de login
        loginButton = new JButton("Login");
        loginButton.setBounds(100, 80, 80, 25);
        frame.add(loginButton);

        // Acción al hacer clic en el botón de login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                    JOptionPane.showMessageDialog(frame, "Ingreso correcto!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Usuario o contraseña invalida", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Mostrar la ventana
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Ejecutar la aplicación
        new Login();
    }
}