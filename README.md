# LLD_BookReader

+-----------------------+
|   OnlineReaderSystem  |
+-----------------------+
| -library: Library      |
| -userManager: UserManager  |
| -display: Display          |
+-----------------------+
| +getBook(): Book       |
| +getUser(): User       |
| +setBook(book: Book)   |
| +setUser(user: User)   |
+-----------------------+

+-----------------+
|   Library       |
+-----------------+
| -books: HashMap |
+-----------------+
| +addBook(book: Book): boolean |
| +removeBook(book: Book): boolean |
| +findBook(bookId: int): Book |
+-----------------+

+-------------------+
|   UserManager     |
|-------------------|
| -users: HashMap  |
+-------------------+
| +addUser(user: User): boolean    |
| +removeUser(user: User): boolean |
| +findUser(userId: int): User     |
+-------------------+

+-------------+
|   Display    |
+-------------+
| -book: Book  |
| -user: User  |
| -pageNumber: int |
+-------------+
| +nextPage(): void   |
| +previousPage(): void |
| +refreshPage(): void |
| +displayUserInfo(): void |
| +displayBookInfo(): void |
+-------------+

+---------+
|   User  |
+---------+
| -id: int  |
| -name: String |
+---------+
| +User(id: int, name: String) |
+---------+

+-------+
| Book  |
+-------+
| -bookId: int |
| -title: String |
| -details: String |
+-------+
| +Book(bookId: int, title: String, details: String) |
+-------+
