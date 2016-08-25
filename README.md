# LiteJavaJson

[![Build Status](https://travis-ci.org/TheoConfidor/PureOOFizzBuzz.svg?branch=master)](https://travis-ci.org/TheoConfidor/PureOOFizzBuzz)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](./LICENSE)

This project was inspired by [Elegant Objects by Yegor Bugayenko](https://www.amazon.com/Elegant-Objects-1-Yegor-Bugayenko/dp/1519166915)

**PureOOFizzBuzz** is a [true object-oriented](http://www.yegor256.com/2014/11/20/seven-virtues-of-good-object.html)
and [immutable](http://www.yegor256.com/2014/06/09/objects-should-be-immutable.html) Java8 demo. Its key benefits, comparing to all others, include these four fundamental principles:

 1. not a single `null` ([why NULL is bad?](http://www.yegor256.com/2014/05/13/why-null-is-bad.html))
 2. not a single `public` `static` method ([why they are bad?](http://www.yegor256.com/2014/05/05/oop-alternative-to-utility-classes.html))
 3. not a single mutable class ([why they are bad?](http://www.yegor256.com/2014/06/09/objects-should-be-immutable.html))
 4. not a single `instanceof` keyword, type casting, or reflection ([why?](http://www.yegor256.com/2015/04/02/class-casting-is-anti-pattern.html))
 5. not a single 'getter' or 'setter' ([why?]http://www.yegor256.com/2014/09/16/getters-and-setters-are-evil.html)
 6. not a single 'new' outside of secondary constructors
 7. not a single Java primitive
 
## Usage

FizzBuzz values cannot be accessed directly. Instead they can be printed to any `Media`.

You can implement `Media` however you like. 

Print to Collection Usage
```
TextCollection media = new TextCollection();
new FizzBuzz(100).print(media);
Collection<String> stringValues = media.strings();
```

Print Range to Collection Usage
```
TextCollection media = new TextCollection();
new FizzBuzz(15, 50).print(media);
Collection<String> stringValues = media.strings();
```

Print to Console Usage

```
new FizzBuzz(100).print(new SystemConsole());
```

## Credits

Silas Reinagel

## License

You may use this code in part or in full however you wish.  
No credit or attachments are required.