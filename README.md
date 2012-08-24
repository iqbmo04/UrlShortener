UrlShortener
============

Converts an auto-generated, unique numeric key to an alphanumeric value using a bijective function.

The intended use is that incrementing, consecutive integers will be used as keys to generate short URLs.
Using this module a unique integer ID assigned by a database to a URL is associated with an alphanumeric value.
This value is substantially shorter in length than the original URL and is desirable in circumstances where
the number of characters is limited or when concealment of the underlying address may be necessary.


Usage
-----

#### Encoding
To translate a numeric key to shortened URL, call the `encode()` method, passing in the key:
```
UrlShortener.encode(2947153); // "mwQT"
```

#### Decoding
To resolve a shortened URL to its numeric key, use the `decode()` method:
```
UrlShortener.decode("mwQT"); // 2947153
```


License
-------
This is free and unencumbered software released into the public domain.

Anyone is free to copy, modify, publish, use, compile, sell, or
distribute this software, either in source code form or as a compiled
binary, for any purpose, commercial or non-commercial, and by any
means.

In jurisdictions that recognize copyright laws, the author or authors
of this software dedicate any and all copyright interest in the
software to the public domain. We make this dedication for the benefit
of the public at large and to the detriment of our heirs and
successors. We intend this dedication to be an overt act of
relinquishment in perpetuity of all present and future rights to this
software under copyright law.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.


