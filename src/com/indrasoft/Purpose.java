package com.indrasoft;

public enum Purpose {
    REALM(new String[]{"apps.realm"}, "during login, validates user credentials and ensures the maximum number of sessions is not exceeded"),
    HELP(new String[]{"apps.search"}, "supports searching within the Online Help pages"),
    HANDLER(new String[]{"handler"}, "a daemon thread that runs at preset intervals to perform system functions"),
    PDF(new String[]{"reports.pdf"}, "supports transforming Online Help pages from HTML format to printable PDFs"),
    MESSAGES(new String[]{"apps.messages"}, "a data entity class used to transport information between client and server by marshalling and unmarshalling it to and from XML"),
    REPORT_MESSAGES(new String[]{"apps.messages.report"}, "a data entity class used by the server to generate Office reports by marshalling it to XML and processing the XML using XSLT"),
    DATASOURCE(new String[]{"database", "datasource"},
            "a class that contributes to making, using, and closing connections to the database"),
    CONTROLLER(new String[]{"controller"},
            "a controller that follows the Model-View-Controller pattern to coordinate communication between the view and the model"),
    GETSET(new String[]{"getset"},
            "a utility class containing accessor and mutator methods for an object. \"GetSet\"classes are used by both view and model classes. In views, they provide the rendered (or user-friendly) value for each of an object's fields. In models, they provide the raw value for each field. If a field is editable by the user, a GetSet class provides \"reverse-translation\"between what the user enters and the allowable values and/or data types for a field."),
    WRAPPER(new String[]{"wrapper"},
            "adds extra functionality to JAXB-generated classes by compositing a JAXB message object within a wrapper object. Common functionality provided by wrapper classes includes boolean flags that indicate whether an object is selected within a list or table."),
    FILTER_POPUP(new String[]{"filterpopup"},
            "a graphical component that displays the filters that can be applied to a table column."),
    FILTER_ROW(new String[]{"filterrow"},
            "a row in a FilterPopup table that contains a checkbox and a value that can be applied as a table filter by checking or unchecking the checkbox."),
    TABLE_HEADER_RENDERER(new String[]{"tableheaderrenderer", "headerrenderer"},
            "renders the column headers in a table that is filterable. Displays an icon to indicate whether a column currently has filters applied. Displays a second icon to indicate if the column is currently sorted, and in what direction."),
    TABLE_SORTER(new String[]{"tablesorter"},
            "contains the logic for how to compare and sort the objects in a table based on the sort criteria the user has applied to the table's columns"),
    RESET_TABLE_PROVIDER(new String[]{"tableprovider"},
            "a utility class that provides access to a module's filterable and/or sortable table and table model in order to reset their filtered and/or sorted status"),
    TABLE_MODEL(new String[]{"tablemodel"},
            "an implementation of the javax.swing.table.TableModel interface. Supplied to a javax.swing.JTable as the model component of the underlying MVC architecture used by Java Swing components"),
    LIST_MODEL(new String[]{"listmodel", "comboboxmodel"},
            "an extension of the javax.swing.AbstractListModel class. Supplied to a javax.swing.JList or javax.swing.JComboBox as the model component of the underlying MVC architecture used by Java Swing components"),
    TREE_MODEL(new String[]{"treemodel", "treetablemodel"},
            "an extension of the javax.swing.tree.DefaultTreeModel class. Supplied to a javax.swing.tree.JTree as the model component of the underlying MVC architecture used by Java Swing components. Tracks the parent-child relationship of the nodes within the tree."),
    TREE_TABLE_LINE(new String[]{"treetableline", "node"},
            "an implementation of the javax.swing.tree.TreeNode interface. Represents a line in a table that can be expanded, collapsed, and contain other lines as children"),
    TREE_RENDERER(new String[]{"treecellrenderer", "treerenderer"},
            "an extension of the javax.swing.tree.DefaultTreeCellRenderer class. Provides a user-friendly, rendered value for every object in a JTree. Can also supply background color, font color, and font styling (italics, bold, etc.) as visual indicators to the user."),
    LIST_RENDERER(new String[]{"listrenderer", "listcellrenderer"},
            "an extension of javax.swing.DefaultListCellRenderer. Provides a user-friendly, rendered value for every object in a JList or JComboBox. Can also supply background color, font color, and font styling (italics, bold, etc.) as visual indicators to the user."),
    TABLE_RENDERER(new String[]{"tablerenderer", "tablecellrenderer"},
            "an extension of javax.swing.table.DefaultTableCellRenderer. Provides a user-friendly, rendered value for every object in a JTable. Can also supply background color, font color, and font styling (italics, bold, etc.) as visual indicators to the user."),
    MAIN_WINDOW(new String[]{"mainwindow", "window"},
            "an extension of javax.swing.JInternalFrame that fulfills the role of view in the Model-View-Controller pattern. Internal frames are displayed within the APPS desktop, and support tiling, resizing, minimizing, and maximizing. They contain other Swing components, such as JPanels and JScrollPanes, to organize the module's user interface widgets"),
    DIALOG(new String[]{"dialog", "dlg"},
            "a small window that provides additional functionality for a module, such as preference setting or filtering"),
    PANEL(new String[]{"tab", "panel"},
            "an extension of javax.swing.JPanel that contains user interface components such as text boxes, buttons, and dropdown boxes. Tabs are used to organize and lay out information within a module"),
    ACTION(new String[]{"action"},
            "an extension of javax.swing.AbstractAction. When applied to a user interface component, such as a button or a dropdown box, notifies the module's controller that the user has interacted with the component"),
    MANAGER(new String[]{"manager"},
            "performs communication with the server using the HTTPS protocol. Marshals outgoing messages (Java objects) to an XML representation. Unmarshals incoming messages from XML to Java objects"),
    REPOSITORY(new String[]{"repository"},
            "fulfills the responsibilities of the view in the Model-View-Controller pattern. Stores data that has been retrieved from the server and is a staging area for data that must be sent to the server"),
    SECURITY(new String[]{"security"},
            "uses a combination of the data in the repository and the user's permission to determine which actions can currently be performed. A security object is used by the view to enable or disable its user interface components according to the business rules codified in the security class"),
    LISTENER(new String[]{"listener"},
            "an interface that is implemented by a module's controller, and whose method is called by a module's view when a predefined user action occurs"),
    PARSER(new String[]{"parser"},
            "parses an XML that is requested from the server as part of APPS self-updating process. XML files contain information about the latest version of APPS and its library dependencies, and the actions required to update the user's installed software"),
    CONSTANTS(new String[]{"constants"},
            "a set of constant values for use in the module"),
    COMPARATOR(new String[]{"comparator"},
            "an extension of java.util.Comparator that contains the logic necessary to compare two Java objects and determine their sort order"),
    EDITOR(new String[]{"tablecelleditor", "tableeditor"},
            "an extension of javax.swing.DefaultCellEditor that provides functionality to update the value in a table cell and report the new value to the table's internal model"),
    UTILITY(new String[]{"util", "utility"},
            "a utility class that provides standardized functionality to a module, such as formatting a date or removing unprintable characters from text"),
    EXCEPTION(new String[]{"exception"},
            "an extension of the java.lang.Exception class. Defines a checked exception that must be handled by a module's controller"),
    FORMATTER(new String[]{"formatter"},
            "a utility class that provides a standardized method of formatting text, such as a user's full name and rank"),
    LINE(new String[]{"line"},
            "a representation of a line of data in a table. A line may be grouped with other lines, summed or sorted with other lines in its group, or be assigned a parent line "),
    RADIO_BUTTON(new String[]{"radiobutton"},
            "an extension of the javax.swing.JRadioButton class. A user interface component that enforces exactly one item be selected in a group of related items"),
    TEXT_AREA(new String[]{"textarea"},
            "an extension of the javax.swing.JTextArea class. A user interface component that allows for freeform text entry. Text areas may be configured with additional features, such as spell checking and limiting the maximum characters it can contain"),
    TEXT_FIELD(new String[]{"textfield"},
            "an extension of the javax.swing.JTextField class. A user interface component that allows for freeform text entry. Text fields may be configured with additional features, such as limiting the maximum characters it can contain, or enforcing numeric input"),
    BUTTON(new String[]{"button"},
            "an extension of the javax.swing.JButton class. A user interface component that allows the user to perform an action by clicking it. A button may display text, and icon, or both"),
    MENU_ITEM(new String[]{"menuitem"},
            "an extension of the javax.swing.JMenuItem class. A user interface component that creates a selectable item in a pull-down menu, typically found on a window's toolbar"),
    MENU(new String[]{"menu"},
            "an extension of the javax.swing.JMenu class. A user interface component that creates a pull-down menu suitable for a window's toolbar"),
    ENUM(new String[]{"enum", "type"},
            "a Java enum that defines a valid set of constant values for a module"),
    COLUMN_ID(new String[]{"columnid"},
            "an identifier for a column in a filterable and/or sortable table"),
    ICON(new String[]{"icon"},
            "a graphical icon, such as the minimize, maximize, and close icons in the top right corner of most windows"),
    TOOLBAR(new String[]{"toolbar"},
            "a user interface component at the top of a window, below the menu. A typical toolbar contains buttons that allow the user to, for example, save, delete, and refresh their work within the module"),
    EVENT(new String[]{"event"},
            "a component of APPS's internal event queue system. Allows disparate modules to register as observers and receive notifications when events occur, such as a window closing or a data set being updated"),
    UPDATER(new String[]{"updater"},
            "a utility class that sums a set of table lines and keeps its rollup/parent line updated"),
    CHOOSER(new String[]{"chooser"},
            "a graphical dialog that prompts the user to make a choice during the login process"),
    TREEVIEW(new String[]{"treeview"},
            "a graphical component that displays help pages in a hierarchical fashion"),
    COMBOBOX(new String[]{"comobobox"},
            "an extension of javax.swing.JComboBox that customizes the behavior of the dropdown list"),
    FILTER(new String[]{"filter"},
            "a class that preprocess server requests"),
    BEAN(new String[]{"bean"},
            "a service class that performs database operations (create, read, update, delete) in response to client requests"),
    REPORT(new String[]{"report", "creator"},
            "a service class that combines a Office document template with customized XML files produced by XSLT to create a finished report in Word, PowerPoint, or Excel format");


    private String[] matchTerms;
    private String description;

    Purpose(String[] matchTerms, String description) {
        this.matchTerms = matchTerms;
        this.description = description;
    }

    public static Purpose getPurpose(String fqcn) {
        for (Purpose purpose : Purpose.values()) {
            if (purpose.matches(fqcn)) {
                return purpose;
            }
        }

        return null;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean matches(String className) {
        String lowercase = className.toLowerCase();
        for (String possible : this.matchTerms) {
            if (lowercase.contains(possible))
                return true;
        }

        return false;
    }
}
