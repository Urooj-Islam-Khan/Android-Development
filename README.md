# Android Development Guide 📱

This README file covers essential concepts and tools used in Android development, providing a brief overview of each term along with examples.

---

## 1. What is Android?
**Android** is an open-source mobile operating system developed by Google, designed primarily for touchscreen devices such as smartphones and tablets. It is built on a modified version of the Linux kernel, making it highly customizable and flexible for developers.

### Example
- Popular Android applications: **WhatsApp, Instagram, YouTube**

---

## 2. What is an IDE?
**IDE** stands for **Integrated Development Environment**, a software application that provides comprehensive tools for software development, including code editors, debuggers, and build automation tools. 

### Example
- The most commonly used IDE for Android development is **Android Studio**.

---

## 3. What are Frontend and Backend in Android?
- **Frontend** in Android refers to the **UI/UX** of the app that users interact with, such as layouts, buttons, and navigation. It is typically built using XML and Java/Kotlin.
- **Backend** in Android involves the logic and data handling, such as managing databases, APIs, and background processes. This is usually implemented using Java/Kotlin.

### Example
- **Frontend**: Activity layouts, XML files.
- **Backend**: Room Database, Retrofit library for API calls.

---

## 4. What are ADB and AVD?
- **ADB (Android Debug Bridge)** is a versatile command-line tool that allows developers to communicate with an emulator instance or connected Android devices. It is used for debugging, installing apps, and accessing device logs.
- **AVD (Android Virtual Device)** is an emulator configuration that lets you simulate an Android device on your computer, allowing you to test applications without a physical device.

### Example
- **ADB Command**: `adb install myApp.apk`
- **AVD Example**: Creating a virtual Pixel 6 emulator in Android Studio.

---

## 5. What is an APK?
**APK (Android Package Kit)** is the file format used to distribute and install applications on Android devices. It contains all the components of an app, including the code, resources, assets, and manifest file.

### Example
- To install an APK on an Android device:
  ```bash `adb install myApp.apk`


---
## 6. What is Debugging?
Debugging is the process of identifying, analyzing, and removing bugs or errors from the code to ensure the application runs smoothly. Android Studio provides various tools such as the Logcat, breakpoints, and the debugger tool to assist in this process.

##  Example
Using Logcat to track down errors:

```Log.d("MainActivity", "App started successfully!"); ```


---
## 7. What is XML?
XML (Extensible Markup Language) is a markup language used in Android for defining the structure and layout of the UI components. It is used to describe the layout of elements like buttons, text views, and images in the app.

## Example
Sample XML for a Button in Android:

```
<Button
    android:id="@+id/buttonSubmit"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Submit" />
```

---
## 8. Layouts in Android Studio (XML)

In Android, **layouts** are the structure that defines the user interface (UI) for an app. These layouts are written in XML and determine the positioning and appearance of UI components.

### Common Layout Types:
- **LinearLayout**: Arranges elements either horizontally or vertically.
- **RelativeLayout**: Positions elements relative to each other or to the parent container.
- **ConstraintLayout**: A more flexible layout that allows complex designs.
- **FrameLayout**: Designed to block out an area on the screen for a single item.
- **TableLayout:** Perfect for creating tabular data displays.

### Example: LinearLayout
```xml
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello, Android!" />
</LinearLayout>

 ```
---
# 📐 Common Layout Types in Android  

Android provides a variety of layout types for arranging UI components. Below are the most commonly used layout types, along with explanations and examples.



## 1. LinearLayout  

**LinearLayout** arranges its children in a single direction — either **horizontally** or **vertically**.  

### Example XML for LinearLayout  
```xml
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="First Item" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Second Item" />
</LinearLayout>
```

### Output
Items are arranged one below the other in vertical orientation.
Changing android:orientation to "horizontal" will align items side by side.


## 2. RelativeLayout
RelativeLayout allows positioning elements relative to each other or the parent container.

Example XML for RelativeLayout
```
<RelativeLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/title"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Title"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Subtitle"
        android:layout_below="@id/title"
        android:layout_centerHorizontal="true" />
</RelativeLayout>
```

### Key Features
- layout_alignParentTop: Aligns the element to the top of the parent.
- layout_below: Positions the element below another element.



## 3. ConstraintLayout
ConstraintLayout is a powerful and flexible layout that enables complex designs with flat hierarchies.

Example XML for ConstraintLayout
```
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/title"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Title"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Click Me"
        app:layout_constraintTop_toBottomOf="@id/title"
        app:layout_constraintStart_toStartOf="parent" />
</androidx.constraintlayout.widget.ConstraintLayout>


```

### Key Features
Constraints define relationships between elements or with the parent.
Ideal for responsive designs.

## 4. FrameLayout
FrameLayout is designed to hold a single child view but can be used with overlapping views.

### Example XML for FrameLayout

```
<FrameLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <ImageView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:src="@drawable/background" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello, FrameLayout!"
        android:layout_gravity="center" />
</FrameLayout>

```

### Key Features
Great for simple use cases like stacking views.
layout_gravity specifies where the child view should appear.

## 5. TableLayout
TableLayout arranges its children into rows and columns, similar to an HTML table.

### Example XML for TableLayout
```
<TableLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TableRow>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Row 1, Column 1" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Row 1, Column 2" />
    </TableRow>

    <TableRow>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Row 2, Column 1" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Row 2, Column 2" />
    </TableRow>
</TableLayout>
```

### Key Features
TableRow defines a row in the table.
Cells in a row are arranged horizontally
---

## 9. Views in Android: Text, Button, Image & EditText Views

Views are the basic building blocks of an Android app's UI. They represent components like text, buttons, images, and input fields.

Common Views:
- **TextView:** Displays text to the user.
- **Button:** A clickable button.
- **ImageView:** Displays an image.
- **EditText:** Allows users to input text.

### Example: Button and EditText
```xml
<EditText
    android:id="@+id/editTextName"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="Enter your name" />

<Button
    android:id="@+id/buttonSubmit"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Submit" /> 
```

---

## 10. Drag and Drop in Android

The Drag and Drop feature allows users to move data or view elements within the app. This functionality is useful in apps where users need to rearrange items, such as in a photo gallery or list.

---

## 11. Android Intent Passing

Intents are used to start activities, services, or deliver broadcasts. They can also be used to pass data between activities.

Types of Intent:
- **Explicit Intent:** Directly specifies the activity to start. (Used to go to other activity of the same app)
- **Implicit Intent:**  Does not specify the target component but instead declares a general action to perform. (Used to go to other app)

### Example:  Passing Data with Intent
```xml
// Sending Activity
Intent intent = new Intent(this, SecondActivity.class);
intent.putExtra("username", "Urooj");
startActivity(intent);

// Receiving Activity
String username = getIntent().getStringExtra("username");
textView.setText("Welcome, " + username);

```
## Implicit Intent:

Used to perform an action without specifying the component. The system decides the best component to handle the intent.

### Example:
```xml
// Example: Open a web page
Intent intent = new Intent(Intent.ACTION_VIEW);
intent.setData(Uri.parse("https://www.google.com"));
startActivity(intent);
```

## Explicit Intent:

Used to launch a specific activity within your app.

### Example:  
```xml
// Example: Navigate to another activity
Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
startActivity(intent);


```
---

## 12. Android Bundle Passing

In Android, **Bundle Passing** is used to send multiple key-value pairs between activities or fragments. Bundles are often used with `Intent` to transfer data.

### How Bundle Passing Works:
1. Create a `Bundle` object.
2. Put data into the bundle using key-value pairs.
3. Attach the bundle to an `Intent`.
4. Retrieve the data in the target activity.

### Example: Passing Data Between Activities

#### Sending Activity
```java
Intent intent = new Intent(this, SecondActivity.class);
Bundle bundle = new Bundle();
bundle.putString("username", "Urooj");
bundle.putInt("age", 22);
intent.putExtras(bundle);
startActivity(intent);
```
---

### Receiving Activity

```
Bundle bundle = getIntent().getExtras();

if (bundle != null) {
    String username = bundle.getString("username");
    int age = bundle.getInt("age");
    textView.setText("Welcome, " + username + "! Age: " + age);
}
```

---

## 13. Splash Screen
A Splash Screen is the first screen that appears when an app is launched. It is often used for branding, initializing resources, or giving a professional look to the app.

### Steps to Create a Splash Screen:
Design the splash screen layout in XML.
Create an activity for the splash screen.
Use a Handler or Timer to delay navigation to the main activity.
### Example: Splash Screen Implementation

-XML Layout (splash_screen.xml)

```
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/primaryColor">

    <ImageView
        android:id="@+id/logo"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:src="@drawable/app_logo" />

</RelativeLayout>
```

- SplashScreenActivity.java

```
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        // Delay for 3 seconds
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 3000); // 3000 ms = 3 seconds
    }
}
```

### Notes:
Ensure to define the SplashScreenActivity in the AndroidManifest.xml file and set it as the launcher activity.

- AndroidManifest.xml

```
<activity android:name=".SplashScreenActivity">
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />
        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity>
```

## 14. What is ListView?

A **ListView** in Android is a view group that displays a list of items in a vertically scrolling list. It is a common way to display long lists of data in an app.

---

## 15. Types of ListView

### 15.1. Simple ListView
A **Simple ListView** displays a list of plain text items.

#### Example: Simple ListView
```java
// Activity
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
            this, android.R.layout.simple_list_item_1, items
        );

        listView.setAdapter(adapter);
    }
}
```

- XML Layout

```
<ListView
    android:id="@+id/listView"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```

### 15.2. Custom ListView
A Custom ListView allows you to design a list item layout with multiple elements, like images and text.

#### Example: Custom ListView
- 1. Create a custom item layout (custom_list_item.xml):

```
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal">

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:src="@drawable/sample_image" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_vertical"
        android:paddingLeft="10dp"
        android:text="Sample Text" />
</LinearLayout>

```
2. Create a custom adapter:
 ```
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] values;

    public CustomAdapter(Context context, String[] values) {
        super(context, R.layout.custom_list_item, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.custom_list_item, parent, false);
        
        TextView textView = rowView.findViewById(R.id.textView);
        ImageView imageView = rowView.findViewById(R.id.imageView);
        
        textView.setText(values[position]);
        imageView.setImageResource(R.drawable.sample_image);

        return rowView;
    }
    }

   ```
- 3. Use the adapter in your activity:
     ```
     String[] items = {"Item 1", "Item 2", "Item 3"};
     ListView listView = findViewById(R.id.listView);
     CustomAdapter adapter = new CustomAdapter(this, items);
     listView.setAdapter(adapter);
     ```

## 15.3. Expandable ListView
An Expandable ListView allows displaying a list where each group can expand to show its children.

#### Example: Expandable ListView
```
import android.os.Bundle;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExpandableListView expandableListView = findViewById(R.id.expandableListView);

        List<String> groupList = new ArrayList<>();
        groupList.add("Fruits");
        groupList.add("Vegetables");

        HashMap<String, List<String>> itemList = new HashMap<>();
        itemList.put("Fruits", List.of("Apple", "Banana", "Mango"));
        itemList.put("Vegetables", List.of("Carrot", "Spinach", "Potato"));

        CustomExpandableListAdapter adapter = new CustomExpandableListAdapter(this, groupList, itemList);
        expandableListView.setAdapter(adapter);
    }
}
```

--- 
## 16. Custom CardView  

CardView is a UI component used to display information in a card format with elevation, rounded corners, and shadows.  

### XML Layout for CardView (`custom_card.xml`)  
```xml
<androidx.cardview.widget.CardView
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_margin="8dp"
    app:cardCornerRadius="12dp"
    app:cardElevation="4dp">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="16dp">

        <TextView
            android:id="@+id/title"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Title"
            android:textStyle="bold"
            android:textSize="18sp" />

        <TextView
            android:id="@+id/description"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Description"
            android:textSize="14sp" />
    </LinearLayout>
</androidx.cardview.widget.CardView>
```

---

## 17. RecyclerView
RecyclerView is a flexible and efficient UI component for displaying large sets of data.

### Steps to Implement RecyclerView
- Step 1: Add RecyclerView to XML Layout
```
<androidx.recyclerview.widget.RecyclerView
    android:id="@+id/recyclerView"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```

- Step 2: Create an Adapter for RecyclerView
```
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private final List<String> dataList;

    public CustomAdapter(List<String> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String data = dataList.get(position);
        holder.title.setText(data);
        holder.description.setText("Description for " + data);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
        }
    }
}
```

- Step 3: Set RecyclerView in Activity
```
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        List<String> dataList = Arrays.asList("Item 1", "Item 2", "Item 3");

        CustomAdapter adapter = new CustomAdapter(dataList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}

```
---

# 18. Fragments in Android  

A **Fragment** is a reusable portion of the user interface in an activity. It allows for modular and flexible UI design by combining multiple fragments in one activity.  

---

## 1. What is a Fragment?  

- A **Fragment** represents a portion of the UI in an activity.  
- It can be added, replaced, or removed dynamically at runtime.  
- Fragments are ideal for creating adaptable designs and reusable UI components.  

---

## 2. Lifecycle of a Fragment  

Fragments have their own lifecycle methods that integrate with the activity's lifecycle.  
The main lifecycle methods are:  

1. **onAttach**: When the fragment is attached to its activity.  
2. **onCreate**: Initializes the fragment.  
3. **onCreateView**: Inflates the fragment’s layout.  
4. **onStart**: Fragment becomes visible.  
5. **onResume**: Fragment is active and interactable.  
6. **onPause**: Fragment is partially visible.  
7. **onDestroyView**: Fragment view is destroyed.  
8. **onDetach**: Fragment is detached from the activity.  

---

## 3. Creating a Fragment  

### Step 1: Create a Fragment Class  
```java
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ExampleFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the fragment layout
        return inflater.inflate(R.layout.fragment_example, container, false);
    }
}
```

### Step 2: Create a Fragment Layout (fragment_example.xml)

```
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello, Fragment!"
        android:textSize="18sp" />
</LinearLayout>
```

### Step 3: Add the Fragment to an Activity

Using XML
Add a FrameLayout as a container in your activity layout:

```
<FrameLayout
    android:id="@+id/fragmentContainer"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />

```

Add the Fragment Dynamically in Activity

```
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add fragment dynamically
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragmentContainer, new ExampleFragment())
                .commit();
    }
}

```

## 4. Communication Between Fragment and Activity
  Sending Data from Activity to Fragment
  ```
Bundle bundle = new Bundle();
bundle.putString("key", "Hello from Activity!");
ExampleFragment fragment = new ExampleFragment();
fragment.setArguments(bundle);

getSupportFragmentManager()
    .beginTransaction()
    .add(R.id.fragmentContainer, fragment)
    .commit();
```

In the fragment:
```
@Override
public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    if (getArguments() != null) {
        String data = getArguments().getString("key");
        TextView textView = view.findViewById(R.id.textView);
        textView.setText(data);
    }
}
```

## 5. Replacing Fragments
Replace an existing fragment with another:

```
AnotherFragment newFragment = new AnotherFragment();
getSupportFragmentManager()
    .beginTransaction()
    .replace(R.id.fragmentContainer, newFragment)
    .addToBackStack(null) // Optional: Add to back stack
    .commit();
```
---

## 19. Tab Layout  

**Tab Layout** is used to display horizontal tabs that can switch between different fragments or activities.  

### XML Layout for Tab Layout  
```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <com.google.android.material.appbar.AppBarLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <com.google.android.material.tabs.TabLayout
            android:id="@+id/tabLayout"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />
    </com.google.android.material.appbar.AppBarLayout>

    <androidx.viewpager2.widget.ViewPager2
        android:id="@+id/viewPager"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
</androidx.coordinatorlayout.widget.CoordinatorLayout>
```

### Setting Up Tab Layout with ViewPager2

```

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager2 viewPager = findViewById(R.id.viewPager);

        viewPager.setAdapter(new FragmentStateAdapter(this) {
            @NonNull
            @Override
            public Fragment createFragment(int position) {
                return new ExampleFragment(position);
            }

            @Override
            public int getItemCount() {
                return 3; // Number of tabs
            }
        });

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            tab.setText("Tab " + (position + 1));
        }).attach();
    }
}

```

---

# 20. Bottom Navigation
Bottom Navigation is used to provide easy navigation between three to five top-level views.

XML Layout for Bottom Navigation

```
<com.google.android.material.bottomnavigation.BottomNavigationView
    android:id="@+id/bottomNavigation"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_gravity="bottom"
    app:menu="@menu/bottom_nav_menu" />

```

Create Menu for Bottom Navigation (res/menu/bottom_nav_menu.xml)

```
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/home"
        android:icon="@drawable/ic_home"
        android:title="Home" />
    <item
        android:id="@+id/search"
        android:icon="@drawable/ic_search"
        android:title="Search" />
    <item
        android:id="@+id/profile"
        android:icon="@drawable/ic_profile"
        android:title="Profile" />
</menu>

```

Setting Up Bottom Navigation in Activity

```
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    // Handle home action
                    return true;
                case R.id.search:
                    // Handle search action
                    return true;
                case R.id.profile:
                    // Handle profile action
                    return true;
                default:
                    return false;
            }
        });
    }
}
```

---

21. Navigation Drawer
Navigation Drawer is a UI panel that displays app’s navigation menu.

XML Layout for Navigation Drawer

```
<androidx.drawerlayout.widget.DrawerLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">

        <androidx.appcompat.widget.Toolbar
            android:id="@+id/toolbar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="?attr/colorPrimary"
            android:title="Navigation Drawer" />

        <!-- Main content -->
    </LinearLayout>

    <com.google.android.material.navigation.NavigationView
        android:id="@+id/navigationView"
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:layout_gravity="start"
        app:menu="@menu/navigation_menu" />
</androidx.drawerlayout.widget.DrawerLayout>

```

Create Menu for Navigation Drawer (res/menu/navigation_menu.xml)

```
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/nav_home"
        android:icon="@drawable/ic_home"
        android:title="Home" />
    <item
        android:id="@+id/nav_settings"
        android:icon="@drawable/ic_settings"
        android:title="Settings" />
    <item
        android:id="@+id/nav_logout"
        android:icon="@drawable/ic_logout"
        android:title="Logout" />
</menu>

```

Setting Up Navigation Drawer in Activity

```
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        NavigationView navigationView = findViewById(R.id.navigationView);

        navigationView.setNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.nav_home:
                    // Handle home navigation
                    return true;
                case R.id.nav_settings:
                    // Handle settings navigation
                    return true;
                case R.id.nav_logout:
                    // Handle logout navigation
                    return true;
                default:
                    return false;
            }
        });
    }
}
```

---

# 22. 🌐 WebView in Android  

**WebView** is a component that displays web pages as part of your activity layout. It acts as a browser inside your app and is commonly used to show external web content.

---

## 1. Adding WebView to Your XML Layout  

```xml
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <WebView
        android:id="@+id/webView"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
</LinearLayout>
```

## 2. Setting Up WebView in Your Activity
Enable JavaScript and Load a URL

```
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.webView);

        // Enable JavaScript
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Load a URL
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com");
    }
}

```

## 3. Loading Local HTML Files
To load a local HTML file from the assets folder:

### Step 1: Place the HTML File

Add your file (e.g., index.html) to the assets folder:
app/src/main/assets/index.html

### Step 2: Load the Local File

```
webView.loadUrl("file:///android_asset/index.html");
```

## 4. Handling Navigation
Prevent opening links in external browsers:

```
webView.setWebViewClient(new WebViewClient() {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
});
```

## 5. Enabling Debugging (Optional)
For debugging purposes, enable WebView debugging:

if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
    WebView.setWebContentsDebuggingEnabled(true);
}


## 6. WebView Permissions
If your WebView needs to load external URLs or resources, add these permissions to AndroidManifest.xml:

```
<uses-permission android:name="android.permission.INTERNET" />
```



