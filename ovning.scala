// Övningar
def applicera(x: Int, f: Int => Int) = f(x)
def dubbla(x: Int) = 2*x
def halva(x: Int) = x/2
val d = applicera(42, dubbla)
val h = applicera(42, halva)
