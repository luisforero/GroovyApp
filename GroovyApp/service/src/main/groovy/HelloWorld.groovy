// This is a single-line comment
println "hello, ${args[0]}"

def radius = 10
def pi = 3.14 //This is not a very precise
/* The next backslash (\) is used indicates that a statement continues on the next line. But remember, avoid this usage
 * in small lines
 */
def area = pi \
  * (radius * radius)

/*
This is a multi-line comment
and here is the second line
 */
/*
 * This is a multiline comment
 * and here is the second line
 */
println "The area is $area"

def myArray = ['Tasmania', 'Victoria', 'New South Wales', 'Queensland', 'Western\
 Australia', 'South Australia']

// The judicious use of line-wrapping may improve readability:
def myArray2 = ['Tasmania',
               'Victoria',
               'New South Wales',
               'Queensland',
               'Western Australia',
               'South Australia']
for(city in myArray){
    println "Está en: ${city}"
}