# EXAMEN UNO
Creation of a clinic program, where you have a control of patients, records and metrics.

Four classes are used:
* [Clinic:](./src/Clinic.java) Here any clinic will be able to use this class, its methods allow it, create patient, add metric, print patients and metric, etc...
* [Metric:](./src/Metric.java) This class is used to take so the parameters of the patients measurements and return their imc.
* [Patient:](./src/Patient.java) Classic class to construct a person with id.
* [Date:](./src/Date.java) Only returns a simple date.

You can use this program in two ways:
* 1.- Use the file [App](./src/App.java), this program was built as a default menu, you just run it.
* 2.- You can use the default menu in [clinic](./src/Clinic.java), or just use the default methods and create a custom menu.